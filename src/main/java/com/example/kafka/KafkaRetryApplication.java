package com.example.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaRetryApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaRetryApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(KafkaProducer producer) {
//        return args -> {
//            producer.sendMessage("test message");      // ✅ Should be consumed successfully
//            producer.sendMessage("fail this message"); // ❌ Will simulate failure and retry 3 times, then go to DLQ
//        };
//    }
}
