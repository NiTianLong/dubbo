package com.longe.provider.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by tianl on 2018/12/18.
 */
public class StartProvider {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("provider.xml");
        ctx.start();

        System.in.read();
    }
}
