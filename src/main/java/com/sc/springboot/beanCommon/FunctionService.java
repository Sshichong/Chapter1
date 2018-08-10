package com.sc.springboot.beanCommon;

import org.springframework.stereotype.Service;

/**
 * Created by shichong on 2018/8/5
 */
@Service //1 编写功能类的bean
public class FunctionService {
    public String sayHello(String word){
        return "Hello " + word + " !";
    }
}
