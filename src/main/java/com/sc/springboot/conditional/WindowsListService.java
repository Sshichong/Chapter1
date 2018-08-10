package com.sc.springboot.conditional;

/**
 * Created by shichong on 2018/8/9
 * windows下创建bean的类
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
