package com.fishchange.fishchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.fishchange.fishchange.model.domain")
public class FishchangeBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FishchangeBeApplication.class, args);
    }

}
