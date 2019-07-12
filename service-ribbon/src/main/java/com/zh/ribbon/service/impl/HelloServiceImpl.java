package com.zh.ribbon.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zh.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * title：HelloServiceImpl
 * projectName ：spring-cloud
 * description： TODO
 * author：  zhouhua
 * date： 2019/7/10 16:01
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHello(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
