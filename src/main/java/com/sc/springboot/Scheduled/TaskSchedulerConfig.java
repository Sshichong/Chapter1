package com.sc.springboot.Scheduled;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by shichong on 2018/8/9
 */
@Configuration
@ComponentScan("com.sc.springboot.Scheduled")
@EnableScheduling//开启对任务计划的支持
public class TaskSchedulerConfig {
}
