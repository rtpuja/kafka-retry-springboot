package com.example.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "test-topic", groupId = "retry-group")
    public void listen(ConsumerRecord<String, String> record) {
        System.out.println("Received: " + record.value());
        if (record.value().contains("fail")) {
            throw new RuntimeException("Simulated failure");
        }
    }

    @KafkaListener(topics = "test-topic.DLT", groupId = "dlq-group")
    public void DlqListener(String message) {
        System.out.println("💀 Message in DLQ: " + message);
    }

}
