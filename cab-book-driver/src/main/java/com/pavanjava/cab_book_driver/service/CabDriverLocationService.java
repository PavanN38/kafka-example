package com.pavanjava.cab_book_driver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabDriverLocationService {
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public boolean updateLocation(String location){
System.out.println(location);
        //kafkaTemplate.send("cab-location", location);
        int partition = location.hashCode() % 3;  // Choose a partition based on location hash
        System.out.println("Sending to partition: " + partition);
        kafkaTemplate.send("cab-location", partition, null, location);  // Sending to a specific partition
        return true;
    }
}
