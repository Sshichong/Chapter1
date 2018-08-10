package com.sc.springboot.beanScope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shichong on 2018/8/5
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService s1 =context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 =context.getBean(DemoSingletonService.class);

        DemoprototypeService p1 =context.getBean(DemoprototypeService.class);
        DemoprototypeService p2 =context.getBean(DemoprototypeService.class);

        System.out.println("s1与s2是否相等："+ s1.equals(s2));
        System.out.println("p1与p2是否相等："+ p1.equals(p2));

        context.close();

    }
}
