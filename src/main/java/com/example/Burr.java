package com.example;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;

import static dev.langchain4j.model.openai.OpenAiChatModelName.GPT_4_O_MINI;
import static dev.langchain4j.model.openai.OpenAiChatModelName.GPT_3_5_TURBO;

public class Burr {
    public static void main( String[] args )
    {
        String prompt = "Who is Burr Sutter in 10 words or less?";

        // OpenAI GPT_4_O_MINI
        String apiKey = System.getenv("OPENAI_API_KEY");
        OpenAiChatModel chatGPT40Mini = OpenAiChatModel.builder()
            .apiKey(apiKey)
            .modelName(GPT_4_O_MINI)
            .build();

        // OpenAI GPT_3_5_TURBO
        OpenAiChatModel chatGPT35Turbo = OpenAiChatModel.builder()
            .apiKey(apiKey)
            .modelName(GPT_3_5_TURBO)
            .build();

        // llama3.2:3b-instruct-q4_K_M
        ChatLanguageModel llama323b = OllamaChatModel.builder()
                .baseUrl("http://localhost:11434")
                .modelName("llama3.2:3b-instruct-q4_K_M")
                .build();

        // llama3.2:1b-instruct-q4_K_M
        ChatLanguageModel llama321b = OllamaChatModel.builder()
                .baseUrl("http://localhost:11434")
                .modelName("llama3.2:1b-instruct-q4_K_M")
                .build();


        // granite3-dense:8b-instruct-q4_K_M
        ChatLanguageModel granite3dense = OllamaChatModel.builder()
                .baseUrl("http://localhost:11434")
                .modelName("granite3-dense:8b-instruct-q4_K_M")
                .build();

        // granite3-moe:3b-instruct-q4_K_M
        ChatLanguageModel granite3moe = OllamaChatModel.builder()
                .baseUrl("http://localhost:11434")
                .modelName("granite3-moe:3b-instruct-q4_K_M")
                .build();


        // mistral:7b-instruct-q4_K_M
        ChatLanguageModel mistral = OllamaChatModel.builder()
                .baseUrl("http://localhost:11434")
                .modelName("mistral:7b-instruct-q4_K_M")
                .build();


        // qwen2.5:0.5b-instruct-q4_K_M
        ChatLanguageModel qwen05b = OllamaChatModel.builder()
                .baseUrl("http://localhost:11434")
                .modelName("qwen2.5:0.5b-instruct-q4_K_M")
                .build();

        // qwen2.5:7b-instruct-q4_K_M
        ChatLanguageModel qwen7b = OllamaChatModel.builder()
                .baseUrl("http://localhost:11434")
                .modelName("qwen2.5:7b-instruct-q4_K_M")
                .build();                

        System.out.println("OpenAI " + GPT_4_O_MINI);
        System.out.println("prompt: " + prompt);
        String answerChatGPT = chatGPT40Mini.generate(prompt);
        System.out.println("answer: " + answerChatGPT + "\n");


        System.out.println("OpenAI " + GPT_3_5_TURBO);
        System.out.println("prompt: " + prompt);
        String answerChatGPT35Turbo = chatGPT35Turbo.generate(prompt);
        System.out.println("answer: " + answerChatGPT35Turbo + "\n");
        

        System.out.println("Ollama llama3.2:3b-instruct-q4_K_M");
        System.out.println("prompt: " + prompt);
        String answerLlama323b = llama323b.generate(prompt);
        System.out.println("answer: " + answerLlama323b + "\n");

        System.out.println("Ollama llama3.2:1b-instruct-q4_K_M");
        System.out.println("prompt: " + prompt);
        String answerLlama321b = llama323b.generate(prompt);
        System.out.println("answer: " + answerLlama321b + "\n");
        
        System.out.println("Ollama granite3-dense:8b-instruct-q4_K_M");
        System.out.println("prompt: " + prompt);
        String answerGranite3dense = granite3dense.generate(prompt);
        System.out.println("answer: " + answerGranite3dense + "\n");

        System.out.println("Ollama granite3-moe:3b-instruct-q4_K_M");
        System.out.println("prompt: " + prompt);
        String answerGranite3moe = granite3moe.generate(prompt);
        System.out.println("answer: " + answerGranite3moe + "\n");

        System.out.println("Ollama mistral:7b-instruct-q4_K_M");
        System.out.println("prompt: " + prompt);
        String answerMistral = mistral.generate(prompt);
        System.out.println("answer: " + answerMistral + "\n");

        System.out.println("Ollama qwen2.5:0.5b-instruct-q4_K_M");
        System.out.println("prompt: " + prompt);
        String answerQwen05b = qwen05b.generate(prompt);
        System.out.println("answer: " + answerQwen05b + "\n");

        System.out.println("Ollama qwen2.5:7b-instruct-q4_K_M");
        System.out.println("prompt: " + prompt);
        String answerQwen7b = qwen7b.generate(prompt);
        System.out.println("answer: " + answerQwen7b + "\n");


    }
    
}
