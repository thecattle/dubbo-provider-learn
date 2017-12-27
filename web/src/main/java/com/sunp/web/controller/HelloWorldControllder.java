package com.sunp.web.controller;

import com.sunp.StringUtils;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunpeng
 * @time 2017/12/26 20:21
 * @description
 */
@EnableAutoConfiguration
@RestController
public class HelloWorldControllder {
    @ResponseBody
    @RequestMapping(value = "/getHello")
    public String hello(){

        return StringUtils.sayHello();
    }
}
