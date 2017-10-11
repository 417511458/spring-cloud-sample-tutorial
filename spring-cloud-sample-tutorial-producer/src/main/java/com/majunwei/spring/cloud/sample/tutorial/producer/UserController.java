package com.majunwei.spring.cloud.sample.tutorial.producer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by majunwei on 2017/10/10.
 */
@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("add")
    @ResponseBody
    public String addUser(String userName, String age) {
        return "Success";
    }
}
