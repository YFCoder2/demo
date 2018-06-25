package com.example.demo;

/**
 * Created by huangzhiwei on 2018/6/21.
 */
public class VaildTest {
    public static void main(String[] args) {
        Ping ping = new Ping();
        User user = new User();
        user.setId(null);
        ping.ping(user);

    }

}
