# Same Prompt, Many Models

Simple example to illustrate the variability across invocations, model vendors, model versions, model parameter counts and model quantization levels.  

This example uses OpenAI and Ollama model servers.  

OpenAI uses an api key

## Usage

```
export OPENAI_API_KEY=sk-proj-1xMQkJtFDA8BMp2-blah-blah
```

Ollama runs on your laptop

```
ollama serve
```

```
ollama pull llama3.2:3b-instruct-q4_K_M
ollama pull llama3.2:1b-instruct-q4_K_M
ollama pull granite3-dense:8b-instruct-q4_K_M
ollama pull granite3-moe:3b-instruct-q4_K_M
ollama pull mistral:7b-instruct-q4_K_M
ollama pull qwen2.5:0.5b-instruct-q4_K_M
ollama pull qwen2.5:7b-instruct-q4_K_M
```

```
https://sdkman.io/

sdk install java 22.0.1-tem

java --version
openjdk 22.0.1 2024-04-16
OpenJDK Runtime Environment Temurin-22.0.1+8 (build 22.0.1+8)
OpenJDK 64-Bit Server VM Temurin-22.0.1+8 (build 22.0.1+8, mixed mode)

sdk install maven 3.8.6

mvn --version
Apache Maven 3.8.6

```

```
mvn clean package
```

```
java -jar target/langchain4j-test-1-1.0-SNAPSHOT-jar-with-dependencies.jar
```

## Example Output

### Say 'Hello World'

```
OpenAI gpt-4o-mini
prompt: Say 'Hello World'
answer: Hello World!

OpenAI gpt-3.5-turbo
prompt: Say 'Hello World'
answer: Hello World

Ollama llama3.2:3b-instruct-q4_K_M
prompt: Say 'Hello World'
answer: Hello World!

Ollama llama3.2:1b-instruct-q4_K_M
prompt: Say 'Hello World'
answer: Hello World!

Ollama granite3-dense:8b-instruct-q4_K_M
prompt: Say 'Hello World'
answer: Hello, world! How can I assist you today?

Ollama granite3-moe:3b-instruct-q4_K_M
prompt: Say 'Hello World'
answer: Hello World. How can I assist you today?

Ollama mistral:7b-instruct-q4_K_M
prompt: Say 'Hello World'
answer: Hello World

Ollama qwen2.5:0.5b-instruct-q4_K_M
prompt: Say 'Hello World'
answer: Hello! World! (Hǎo!) It's a simple yet profound statement that encapsulates the essence of programming and computing. Here are some ways you can say "Hello World" in different languages:

1. English: Hello, World!
2. French: Bonjour, Terre!
3. Spanish: Hola, Mundo!
4. Italian: Greetings, World!
5. German: Hallo, Welt!
6. Mandarin Chinese (Simplified): 你好，世界！
7. Mandarin Chinese (Traditional): 欢迎，世界！
8. Hindi: बाद में, स्कैल
9. Japanese: こんにちは、世界！
10. Korean: 안녕하세요, 세상!
11. Arabic: أ goodbye here! (Sorry!)

Feel free to say "Hello World" in any of these languages or modify it according to your preferences!

Ollama qwen2.5:7b-instruct-q4_K_M
prompt: Say 'Hello World'
answer: Hello World! How can I assist you today?
```

```
OpenAI gpt-4o-mini
prompt: Say 'Hello World'
answer: Hello World!

OpenAI gpt-3.5-turbo
prompt: Say 'Hello World'
answer: Hello World

Ollama llama3.2:3b-instruct-q4_K_M
prompt: Say 'Hello World'
answer: Hello World!

Ollama llama3.2:1b-instruct-q4_K_M
prompt: Say 'Hello World'
answer: Hello, World!

Ollama granite3-dense:8b-instruct-q4_K_M
prompt: Say 'Hello World'
answer: Hello World! How can I assist you today?

Ollama granite3-moe:3b-instruct-q4_K_M
prompt: Say 'Hello World'
answer: Hello World! How can I assist you today?

Ollama mistral:7b-instruct-q4_K_M
prompt: Say 'Hello World'
answer: 
python
print('Hello World')


Ollama qwen2.5:0.5b-instruct-q4_K_M
prompt: Say 'Hello World'
answer: Hello! World! How can I help you today?

Ollama qwen2.5:7b-instruct-q4_K_M
prompt: Say 'Hello World'
answer: Hello World! How can I assist you today?
```

```
OpenAI gpt-4o-mini
prompt: Say 'Hello World'
answer: Hello World!

OpenAI gpt-3.5-turbo
prompt: Say 'Hello World'
answer: Hello World

Ollama llama3.2:3b-instruct-q4_K_M
prompt: Say 'Hello World'
answer: Hello World!

Ollama llama3.2:1b-instruct-q4_K_M
prompt: Say 'Hello World'
answer: Hello World!

Ollama granite3-dense:8b-instruct-q4_K_M
prompt: Say 'Hello World'
answer: Hello World! How can I assist you today?

Ollama granite3-moe:3b-instruct-q4_K_M
prompt: Say 'Hello World'
answer: Hello! How can I assist you today?

Ollama mistral:7b-instruct-q4_K_M
prompt: Say 'Hello World'
answer: 
python
print('Hello World')


Ollama qwen2.5:0.5b-instruct-q4_K_M
prompt: Say 'Hello World'
answer: Hello! I'm Qwen, an AI developed by Alibaba Cloud. I'm ready to assist you with any questions or tasks you might have. How can I help you today?

Ollama qwen2.5:7b-instruct-q4_K_M
prompt: Say 'Hello World'
answer: Hello World! How can I assist you today?
```

### "Who is Burr Sutter in 10 words or less?"

```
OpenAI gpt-4o-mini
prompt: Who is Burr Sutter in 10 words or less?
answer: Burr Sutter is a software engineer and Kubernetes expert.

OpenAI gpt-3.5-turbo
prompt: Who is Burr Sutter in 10 words or less?
answer: Director of Developer Experience at Red Hat.

Ollama llama3.2:3b-instruct-q4_K_M
prompt: Who is Burr Sutter in 10 words or less?
answer: I couldn't find any notable information on a person named Burr Sutter.

Ollama llama3.2:1b-instruct-q4_K_M
prompt: Who is Burr Sutter in 10 words or less?
answer: Burr Sutter is a character from the TV series Yellowstone.

Ollama granite3-dense:8b-instruct-q4_K_M
prompt: Who is Burr Sutter in 10 words or less?
answer: Burr Sutter is a software engineer at Red Hat, known for his work on Java and DevOps.

Ollama granite3-moe:3b-instruct-q4_K_M
prompt: Who is Burr Sutter in 10 words or less?
answer: A pioneering American inventor and entrepreneur.

Ollama mistral:7b-instruct-q4_K_M
prompt: Who is Burr Sutter in 10 words or less?
answer: A minor character from "The Walking Dead"

Ollama qwen2.5:0.5b-instruct-q4_K_M
prompt: Who is Burr Sutter in 10 words or less?
answer: Burr Sutter is an American former professional baseball player who played as a pitcher and shortstop. He was known for his speed, power, and striking ability, making him one of the most dominant players in the league during the late 1950s to early 1960s.

Ollama qwen2.5:7b-instruct-q4_K_M
prompt: Who is Burr Sutter in 10 words or less?
answer: Burr Sutter is a character from the TV show "Elementary."
```
