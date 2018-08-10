package com.sc.springboot.applicationEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by shichong on 2018/8/9
 * 事件发布类
 */
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationContext;//注入applicationcontext用来

    public void publish(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));//用publishEvent方法发布
    }
}
