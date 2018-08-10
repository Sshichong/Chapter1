package com.sc.springboot.Scheduled;

import com.sc.springboot.Thread.TaskExecutorConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shichong on 2018/8/9
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new
                AnnotationConfigApplicationContext(TaskExecutorConfig.class);
    }
}
