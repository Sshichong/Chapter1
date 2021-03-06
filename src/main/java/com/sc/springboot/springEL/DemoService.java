package com.sc.springboot.springEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by shichong on 2018/8/6
 * 注入bean
 */
@Service
public class DemoService {
    @Value("其他属性的类")//注入普通字符串
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
