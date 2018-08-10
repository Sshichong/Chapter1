package com.sc.springboot.applicationEvent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shichong on 2018/8/9
 * Spring的事件需要遵循如下流程：
 * （1）自定义事件，继承ApplicationEvent
 * （2）定义事件监听器，实现ApplicationListener
 * （3）使用容器发布事件
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher demoPublisher =context.getBean(DemoPublisher.class);

        demoPublisher.publish("hello application event");

        context.close();
    }
}
