package com.majunwei.spring.cloud.sample.tutorial.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * Created by majunwei on 2017/10/13.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Bean
    @LoadBalanced
    RestTemplate initRestTemplate(){
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("add")
    @ResponseBody
    public String add(String userName, String age){
        return restTemplate.getForEntity("http://PRODUCER/user/add",String.class,userName,age).getBody();
    }
}
