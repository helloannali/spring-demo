package com.dollar.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan({"com.dollar.elasticsearch"})
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
//        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        SpringApplication.run(Application.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

//        String[] beanNames = ctx.getBeanDefinitionNames();
//
//        Arrays.sort(beanNames);
//
//        for (String beanName : beanNames) {
//            System.out.println("---spring-data-elasticsearch---" + beanName);
//        }
    }
}
