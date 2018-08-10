package com.sc.springboot.springEL;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;


/**
 * Created by shichong on 2018/8/6
 */
@Configuration
@ComponentScan("com.sc.springboot.springEL")
@PropertySource(value = "config/test.properties",ignoreResourceNotFound = true)//注入配置文件
public class ELConfig {
    @Value("I am shichong")//普通字符串
    private String normal;

    @Value("#{systemProperties['os.name']}")//注入操作系统属性
    private String osName;

    @Value("#{T(java.lang.Math).random()*100.0}")//表达式结果
    private double randomNumber;

    @Value("demoService.another")//注入其他bean的属性
    private String fromAnother;

    @Value("config/test.txt")//注入文件资源
    private  Resource testFile;

    @Value("http://www.baidu.com")//注入网址资源
    private Resource testUrl;

    @Value("${book.name}")//注入配置文件
    private String bookName;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        try {
            System.out.println("normal:"+normal);
            System.out.println("osName:"+osName);
            System.out.println("randomNumber:"+randomNumber);
            System.out.println("fromAnother:"+fromAnother);

            System.out.println("testFile"+IOUtils.toString(testFile.getInputStream()));
            System.out.println("testUrl:"+IOUtils.toString(testUrl.getInputStream()));
            System.out.println("bookName:"+bookName);
            System.out.println("book.author:"+environment.getProperty("book.author"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
