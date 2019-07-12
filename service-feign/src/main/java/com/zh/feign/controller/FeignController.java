package com.zh.feign.controller;

import com.zh.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * title：FeignController
 * projectName ：spring-cloud
 * description： TODO
 * author：  zhouhua
 * date： 2019/7/11 9:56
 */
@RestController
public class FeignController {

    @Autowired
    FeignService feignService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
            return feignService.sayHiFromFeignService(name);
    }
}
