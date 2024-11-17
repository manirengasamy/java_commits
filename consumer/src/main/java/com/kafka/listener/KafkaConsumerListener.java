package com.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerListener {


    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.group-id}")
    public void listen(String message) {
        final String consumeMessage = String.format("Received Messasge: [%s] ", message);
        System.out.println(consumeMessage);
    }
}
