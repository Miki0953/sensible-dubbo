package com.sensible.dubbo.consumer;

import com.sensible.dubbo.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author liuyc
 * @Description: 消费者应用
 * @date 2020/3/3 000310:44
 */
public class ConsumerApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:resources/dubbo-consumer.xml");
        context.start();
        HelloService helloService = (HelloService) context.getBean("helloService");
        String hiStr = helloService.sayHi("Alibaba Dubbo!");
        System.out.println("消费者服务消费成功:"+hiStr);
        System.in.read();
    }
}
