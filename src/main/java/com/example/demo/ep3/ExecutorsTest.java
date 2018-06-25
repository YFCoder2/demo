package com.example.demo.ep3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by huangzhiwei on 2018/6/22.
 */
public class ExecutorsTest {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();
    }
}
