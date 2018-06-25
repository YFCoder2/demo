package com.example.demo;

import io.netty.buffer.ByteBuf;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author huangzhiwei
 * @date 2018/4/3
 */
@RestController("/log")
public class Test {

    @RequestMapping(value="/test")
    public String queryContentListByStatus(User user){
       return  "";
    }

}
