package com.sc.springboot.springAware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by shichong on 2018/8/9
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware {//实现BeanNameAware，ResourceLoaderAware接口，获得bean名称和资源加载的服务
    private String beanName;
    private ResourceLoader loader;

    @Override
    public void setBeanName(String s) { //实现BeanNameAware 需重写setBeanName方法
        this.beanName =s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {//实现ResourceLoaderAware 需重写setResourceLoader
        this.loader =resourceLoader;
    }

    public void outputResult(){
        System.out.println("Bean的名称为："+beanName);

        Resource resource =
                loader.getResource("config/test.txt");

        try {
            System.out.println("ResourceLoader加载的文件内容为："+ IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
