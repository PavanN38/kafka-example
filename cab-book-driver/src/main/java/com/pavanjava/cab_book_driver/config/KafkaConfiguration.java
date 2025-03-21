package com.pavanjava.cab_book_driver.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfiguration {
@Bean
    public NewTopic createTopic(){

        return TopicBuilder
                .name("cab-location")
                .build();
    }
}
