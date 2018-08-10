package com.sc.springboot.beanCommon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shichong on 2018/8/5
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(DiConfig.class);

        UseFunctionService useFunctionService =context.getBean(UseFunctionService.class);//获得声明配置的bean

        System.out.println(useFunctionService.SayHello("helloworld"));

        context.close();
    }
}
