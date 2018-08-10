package com.sc.springboot.springEL;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shichong on 2018/8/6
 */
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(ELConfig.class);

        ELConfig resourceService =context.getBean(ELConfig.class);
        resourceService.outputResource();
        context.close();
    }
}
