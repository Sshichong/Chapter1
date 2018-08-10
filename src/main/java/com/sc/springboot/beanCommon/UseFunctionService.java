package com.sc.springboot.beanCommon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shichong on 2018/8/5
 */
@Service //2 使用功能类bean
public class UseFunctionService {
    @Autowired //把FunctionService 实体类bean注入到useFunctionService中
    FunctionService functionService;

    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
