package com.example.kafka;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    private final KafkaProducer producer;

    public KafkaController(KafkaProducer producer) {
        this.producer = producer;
    }

    @PostMapping("/send")
    public String send(@RequestBody String message) {
        producer.sendMessage(message);
        return "Message sent to Kafka: " + message;
    }
}

