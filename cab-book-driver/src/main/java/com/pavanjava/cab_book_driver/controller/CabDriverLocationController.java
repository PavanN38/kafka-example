package com.pavanjava.cab_book_driver.controller;

import com.pavanjava.cab_book_driver.service.CabDriverLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("/location")
public class CabDriverLocationController {


    @Autowired
    private CabDriverLocationService cabDriverLocationService;

    @PutMapping
    public ResponseEntity updateLocation() throws InterruptedException {

        int i=50;
        while (i>=0){
            cabDriverLocationService.updateLocation(Math.random()+" ,"+Math.random());
            Thread.sleep(1000);
            i--;
        }
        return new ResponseEntity(Map.of("message", "Location Updated from driver"), HttpStatus.OK);
    }

}
