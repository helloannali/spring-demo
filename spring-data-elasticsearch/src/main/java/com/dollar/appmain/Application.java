package com.dollar.appmain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * Created by annali on 5/15/16.
 */
//@Configuration
//@ComponentScan({"com.cnpc.situationAwareness"})
//@ImportResource({
//        "classpath:/psyche/psyche-app.xml",
//        "classpath:/psyche/psyche-mvc.xml"
//})
//@EnableAutoConfiguration
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();

        Arrays.sort(beanNames);

        for (String beanName : beanNames){
            System.out.println("---spring-data-elasticsearch---" + beanName);
        }
    }
}
