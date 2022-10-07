package com.lerning.microservices.learningspringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class LearningSpringCloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningSpringCloudConfigServerApplication.class, args);
    }

}
