# Kafka Spring Boot Application

This is a Spring Boot application that demonstrates the use of Apache Kafka for producing and consuming messages.

## Features

- **Producer**: Sends messages to a Kafka topic.
- **Consumer**: Listens to messages from a Kafka topic and processes them.
- **Dead Letter Queue (DLQ)**: Handles failed messages by redirecting them to a DLQ.

## Project Structure

- `KafkaProducer`: Sends messages to the Kafka topic.
- `KafkaConsumer`: Consumes messages from the Kafka topic and handles failures.
- `KafkaController`: REST API to send messages to Kafka.

## Prerequisites

- Java 17+
- Apache Kafka
- Maven

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/pooja-maersk/kafka-spring-boot-app.git
   cd kafka-spring-boot-app

1. `Build the project`:  
   mvn clean install
   Run the application:  
   mvn spring-boot:run
2. `API Endpoints`
   POST /kafka/send: Sends a message to the Kafka topic.
   Request Body: Plain text message.
   Example Usage
   Start Kafka and create the following topics:  
   test-topic
   test-topic.DLT
Use the following curl command to send a message:  
curl -X POST -H "Content-Type: text/plain" -d "Hello Kafka" http://localhost:8080/kafka/send
Check the logs to see the message being consumed. 