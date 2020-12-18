package com.example.jms.listener;

import com.example.jms.config.JmsConfig;
import com.example.jms.model.HelloWorldMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;

import javax.jms.Message;

@Component
public class HelloMessageListener {

    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listen(HelloWorldMessage helloWorldMessage,
                       MessageHeaders headers,
                       Message message) {
        System.out.println("I Got the message !");
        System.out.println(helloWorldMessage);
    }
}
