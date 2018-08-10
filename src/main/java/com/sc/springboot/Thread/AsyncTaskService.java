package com.sc.springboot.Thread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by shichong on 2018/8/9
 */
@Service
public class AsyncTaskService {
    @Async//表明这个方法是个异步方法，如果注解在类级别，则表明该类的所有方法都是异步方法，会被自动注入ThreadPoolTaskExector作为TaskExecutor
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务："+i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1"+(i+1));
    }
}
