package com.sc.springboot.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shichong on 2018/8/9
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("dev");//设置为prod
        context.register(ProfileConfig.class);//注册bean配置类
        context.refresh();//刷新容器

        DemoBean demoBean =context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());

        context.close();

    }
}
