package com.sc.springboot.metaAnnotationAndcombinationAnnotation;

import org.springframework.stereotype.Service;

/**
 * Created by shichong on 2018/8/10
 * 演示服务bean
 */
@Service
public class DemoService {
    public void outputResult(){
        System.out.println("从组合注解配置照样获得bean");
    }
}
