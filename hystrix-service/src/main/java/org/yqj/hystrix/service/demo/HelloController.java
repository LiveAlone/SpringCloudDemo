package org.yqj.hystrix.service.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yqj.hystrix.service.demo.service.HelloService;
import org.yqj.hystrix.service.demo.service.SchedualServiceHi;

/**
 * Created by yaoqijun on 2017/6/4.
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }

    @RequestMapping(value = "/hi2")
    public String hi2(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
