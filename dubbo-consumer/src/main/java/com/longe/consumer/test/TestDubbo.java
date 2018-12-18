package com.longe.consumer.test;

import com.longe.common.service.ISayHelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by tianl on 2018/12/18.
 */
public class TestDubbo {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("consumer.xml");
        ISayHelloService sayHelloService = (ISayHelloService) ctx.getBean("sayHello");
        String s = sayHelloService.sayHello("张三");
        System.err.println(s);

        System.in.read();
    }
}
