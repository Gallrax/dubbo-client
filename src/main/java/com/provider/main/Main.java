package com.provider.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author: 冯冠凯
 * @Description:
 * @Date: Created on 2017/8/17
 * @Version: 1.0
 */
public class Main {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        context.start();

        System.in.read();
    }
}
