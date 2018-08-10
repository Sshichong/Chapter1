package com.sc.springboot.metaAnnotationAndcombinationAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shichong on 2018/8/10
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new
                AnnotationConfigApplicationContext(DemoConfig.class);

        DemoService demoService =context.getBean(DemoService.class);

        demoService.outputResult();

        context.close();
    }
}
