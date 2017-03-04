package com.yongliang.dubbo.provider;

import com.yongliang.dubbo.api.HelloWordService;


/**
 * Created by ZhangYongliang on 2017/3/4.
 */

public class HelloWordServiceImpl implements HelloWordService {
    public String sayHello(String s) {
        return "Hello world"+s;
    }
}
