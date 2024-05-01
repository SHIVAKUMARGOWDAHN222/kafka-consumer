package com.producerdemo.consumer;

import com.producerdemo.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

  /*  @KafkaListener(topics = "customer-demo",groupId = "demo-group")
    public void consumeEvents(Customer customer) {
        log.info("consumer consume the events {} ", customer.toString());
    }*/

    @KafkaListener(topics = "message-demo",groupId = "demo-group-new")
    public void consume2(String message) {
        log.info("consumer2 consume the message {} ", message);
    }

    @KafkaListener(topics = "message-demo",groupId = "demo-group-new")
    public void consume3(String message) {
        log.info("consumer3 consume the message {} ", message);
   }

    @KafkaListener(topics = "message-demo",groupId = "demo-group-new")
    public void consume4(String message) {
        log.info("consumer4 consume the message {} ", message);
    }
}
