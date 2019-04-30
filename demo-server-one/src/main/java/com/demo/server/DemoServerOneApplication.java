package com.demo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoServerOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServerOneApplication.class, args);
    }

}
