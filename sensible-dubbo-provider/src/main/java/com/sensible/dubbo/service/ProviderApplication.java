package com.sensible.dubbo.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author liuyc
 * @Description: dubbo生成者启动类
 * @date 2020/3/2 000217:43
 */
public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:resources/dubbo-provider.xml");
        context.start();
        System.out.println("生成者服务启动成功！");
        System.in.read();
    }
}
