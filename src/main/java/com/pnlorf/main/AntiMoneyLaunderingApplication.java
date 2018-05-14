package com.pnlorf.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序入口
 */
@SpringBootApplication(scanBasePackages = "com.pnlorf")
public class AntiMoneyLaunderingApplication {

    public static void main(String[] args) {
        SpringApplication.run(AntiMoneyLaunderingApplication.class, args);
    }
}
