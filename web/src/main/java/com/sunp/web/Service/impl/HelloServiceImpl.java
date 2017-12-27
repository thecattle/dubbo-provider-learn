package com.sunp.web.Service.impl;

import com.sunp.Service.HelloService;
import com.sunp.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @author sunpeng
 * @time 2017/12/26 20:45
 * @description
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService{

    @Override
    public String sayHello() {
        return StringUtils.sayHello();
    }
}
