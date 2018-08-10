package com.sc.springboot.beanInitAndDestory;

import org.springframework.context.annotation.Bean;

/**
 * Created by shichong on 2018/8/7
 * 使用@Bean形式的bean
 */
public class BeanWayService {

    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }


    public void destroy(){
        System.out.println("@Bean-destroy-method");
    }
}
