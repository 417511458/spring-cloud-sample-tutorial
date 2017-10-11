package com.majunwei.spring.cloud.sample.tutorial.producer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by majunwei on 2017/10/10.
 */
@Controller("user")
public class UserController {
    @RequestMapping("add")
    public String addUser(String userName, String age) {
        return "Success";
    }
}
