package com.example.jms;

import org.apache.activemq.artemis.api.core.management.ActiveMQServerControl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JmsApplication {

    public static void main(String[] args) {


        SpringApplication.run(JmsApplication.class, args);
    }

}
