package com.sc.springboot.applicationEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by shichong on 2018/8/9
 * 事件监听器
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {//实现ApplicationListener接口，并指定监听的时间类型

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {//用onApplicationEvent方法对消息进行接受处理
        String msg = demoEvent.getMsg();

        System.out.println("我（bean-demoListener）接收到了bean-demoListener发布的消息"+msg);
    }
}
