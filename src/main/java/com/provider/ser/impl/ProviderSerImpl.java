package com.provider.ser.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.provider.ser.ProviderSer;

/**
 * @Author: 冯冠凯
 * @Description:
 * @Date: Created on 2017/8/17
 * @Version: 1.0
 */
@Service(version = "1.0.0")
public class ProviderSerImpl implements ProviderSer {

    public String sayHello(String name) {
        return " hello : "+ name;
    }
}
