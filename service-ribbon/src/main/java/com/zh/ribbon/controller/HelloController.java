package com.zh.ribbon.controller;

import com.zh.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * title：HelloController
 * projectName ：spring-cloud
 * description： TODO
 * author：  zhouhua
 * date： 2019/7/10 16:05
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.sayHello( name );
    }
}
