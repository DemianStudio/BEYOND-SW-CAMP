package com.ohgiraffers.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Chpa05ConfigServerLectureSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chpa05ConfigServerLectureSourceApplication.class, args);
    }

}
