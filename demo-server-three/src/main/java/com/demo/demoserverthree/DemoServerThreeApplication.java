package com.demo.demoserverthree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoServerThreeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServerThreeApplication.class, args);
    }

}
