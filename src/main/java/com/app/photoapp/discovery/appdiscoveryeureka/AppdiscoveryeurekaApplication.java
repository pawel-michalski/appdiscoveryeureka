package com.app.photoapp.discovery.appdiscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppdiscoveryeurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppdiscoveryeurekaApplication.class, args);
    }

}
