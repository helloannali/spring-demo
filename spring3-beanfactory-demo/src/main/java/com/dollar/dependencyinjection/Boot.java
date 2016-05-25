package com.dollar.dependencyinjection;

import com.dollar.dependencyinjection.service.AppService;
import com.dollar.dependencyinjection.service.impl.AppService2Impl;
import com.dollar.dependencyinjection.service.impl.AppServiceImpl;
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
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"conf/spring/dependencyinjection/ioc-beans.xml"});

        String[] beanNames = context.getBeanDefinitionNames();

        for (String beanName : beanNames){
            System.out.println(beanName);
        }

        System.out.println("------------------------");

        AppService appService = context.getBean("appService", AppServiceImpl.class);
        System.out.println(appService.getAppDao().hashCode());
        System.out.println(appService.getMsg());

        System.out.println("------------------------");

        AppService appService2 = context.getBean("appService2", AppService2Impl.class);
        System.out.println(appService.getAppDao().hashCode());
        System.out.println(appService2.getMsg());
    }
}
