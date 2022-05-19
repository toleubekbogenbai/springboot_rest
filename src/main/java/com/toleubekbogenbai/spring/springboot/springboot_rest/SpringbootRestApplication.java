package com.toleubekbogenbai.spring.springboot.springboot_rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class SpringbootRestApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootRestApplication.class, args);
    }
}
