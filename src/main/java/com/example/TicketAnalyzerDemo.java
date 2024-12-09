package com.example;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.output.structured.Description;
import dev.langchain4j.service.AiServices;

import static dev.langchain4j.model.openai.OpenAiChatModelName.GPT_4_O_MINI;
import static org.assertj.core.api.Assertions.assertThat;

public class TicketAnalyzerDemo {

    public interface TicketAnalyzer {

        AnalyzedTicket analyze(String ticket);
    }

    public record AnalyzedTicket(
            @Description("describe your reasoning") String reasoning,
            CustomerIntent intent,
            @Description("between 0 and 1") double confidence,
            boolean escalate
    ) {
    }

    public enum CustomerIntent {
        BILLING_INVOICE,
        COMPLAINT
    }

    public static void main(String[] args) {

        String apiKey = System.getenv("OPENAI_API_KEY");

        ChatLanguageModel chatLanguageModel = OpenAiChatModel.builder()
                .apiKey(apiKey)
                .modelName(GPT_4_O_MINI)

                .responseFormat("json_schema") // responseFormat and strictJsonSchema are required to enable structured outputs
                .strictJsonSchema(true)

                .logRequests(true)
                .logResponses(true)
                .build();

        TicketAnalyzer ticketAnalyzer = AiServices.builder(TicketAnalyzer.class)
                .chatLanguageModel(chatLanguageModel)
                .build();

        String ticket = "Hello, I purchased a TechGear Pro Laptop, but I can't find the invoice in my email.";

        AnalyzedTicket analyzedTicket = ticketAnalyzer.analyze(ticket);
        System.out.println(analyzedTicket);

        assertThat(analyzedTicket.reasoning()).isNotBlank();
        assertThat(analyzedTicket.intent()).isEqualTo(CustomerIntent.BILLING_INVOICE);
        assertThat(analyzedTicket.confidence()).isGreaterThan(0.8);
        assertThat(analyzedTicket.escalate()).isFalse();
    }
}
