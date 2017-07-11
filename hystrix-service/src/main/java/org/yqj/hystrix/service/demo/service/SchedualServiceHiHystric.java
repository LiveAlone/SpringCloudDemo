package org.yqj.hystrix.service.demo.service;

import org.springframework.stereotype.Component;

/**
 * Created by yaoqijun on 2017/7/11.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
