package com.zh.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * title：FeignService
 * projectName ：spring-cloud
 * description： TODO
 * author：  zhouhua
 * date： 2019/7/11 9:53
 */
@FeignClient(value = "service-hi",fallback = FeignServiceHiHystric.class)
public interface FeignService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromFeignService(@RequestParam(value = "name") String name);
}
