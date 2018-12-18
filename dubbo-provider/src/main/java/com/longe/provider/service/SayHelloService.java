package com.longe.provider.service;

import com.longe.common.service.ISayHelloService;

/**
 * Created by tianl on 2018/12/18.
 */
public class SayHelloService implements ISayHelloService{

    public String sayHello(String name) {

        return "hello," + name;
    }
}
