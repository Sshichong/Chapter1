package com.sc.springboot.beanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by sccccc on 2018/8/5
 */
@Service
@Scope("prototype")
public class DemoprototypeService {
}
