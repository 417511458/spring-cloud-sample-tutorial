package com.majunwei.spring.cloud.sample.tutorial.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by majunwei on 2017/10/10.
 */
@Controller
@RequestMapping("user")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;
    @RequestMapping("add")
    @ResponseBody
    public String addUser(String userName, String age) {
        return "Success from " + client.getLocalServiceInstance().getHost() + ":" + client.getLocalServiceInstance().getPort() ;
    }
}
