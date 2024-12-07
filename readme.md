Simple example to illustrate the variability across model vendors, model versions, model parameter counts, model quantization levels.  

```
mvn clean package
```

```
java -jar target/langchain4j-test-1-1.0-SNAPSHOT-jar-with-dependencies.jar
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
