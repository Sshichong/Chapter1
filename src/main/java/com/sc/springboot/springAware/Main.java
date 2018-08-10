package com.sc.springboot.springAware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shichong on 2018/8/9
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AwareConfig.class);

        AwareService awareService =context.getBean(AwareService.class);
        awareService.outputResult();

        context.close();
    }
}
