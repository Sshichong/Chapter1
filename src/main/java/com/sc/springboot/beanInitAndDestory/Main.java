package com.sc.springboot.beanInitAndDestory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.PreDestroy;

/**
 * Created by shichong on 2018/8/7
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new
                AnnotationConfigApplicationContext(PrePostConfig.class);

        BeanWayService beanWayService =context.getBean(BeanWayService.class);

        JSR250WayService jsr250WayService =context.getBean(JSR250WayService.class);

        context.close();
    }
}
