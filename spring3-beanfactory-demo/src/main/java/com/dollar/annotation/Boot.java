package com.dollar.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author why
 * Date 16-5-25
 * Version : soc-ia-1.0
 * Copyright : cnpc
 */
public class Boot {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"conf/spring/annotation/ioc-beans.xml"});

        String[] beanNames = ctx.getBeanDefinitionNames();

        for (String beanName : beanNames){
            System.out.println(beanName);
        }

        SimpleMovieLister entity = ctx.getBean(SimpleMovieLister.class);
    }
}
