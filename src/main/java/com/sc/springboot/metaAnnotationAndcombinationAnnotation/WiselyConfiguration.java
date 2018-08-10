package com.sc.springboot.metaAnnotationAndcombinationAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * Created by shichong on 2018/8/10
 * 示例组合注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration//元注解
@ComponentScan//元注解
public @interface WiselyConfiguration {
    String [] value() default {};//覆盖value参数
}
