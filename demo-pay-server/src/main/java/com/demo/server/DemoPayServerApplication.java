package com.demo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoPayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoPayServerApplication.class, args);
    }

}
