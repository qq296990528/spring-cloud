package com.zh.feign.service;

import org.springframework.stereotype.Component;

/**
 * title：FeignServiceHiHystric
 * projectName ：spring-cloud
 * description： TODO
 * author：  zhouhua
 * date： 2019/7/11 11:45
 */
@Component
public class FeignServiceHiHystric implements FeignService {

    @Override
    public String sayHiFromFeignService(String name) {
        return "sorry"+name;
    }
}
