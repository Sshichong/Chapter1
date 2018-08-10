package com.sc.springboot.conditional;

/**
 * Created by shichong on 2018/8/9
 * Linux下创建的bean的类
 */
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
