package org.yqj.ribbon.server.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * Created by yaoqijun on 2017/6/4.
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String hiService(String name){
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

}
