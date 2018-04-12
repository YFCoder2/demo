package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huangzhiwei on 2018/4/3.
 */
@RestController("/log")
public class Test {

    @GetMapping("test")
    User  test(){
        User user = new User();
                return  user;
    }
}
