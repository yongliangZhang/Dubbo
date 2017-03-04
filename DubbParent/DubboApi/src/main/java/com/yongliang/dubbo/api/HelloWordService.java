package com.yongliang.dubbo.api;

/**
 * Created by ZhangYongliang on 2017/3/4.
 */
public interface HelloWordService {
    /**
     * 定义对外暴露的接口
     * @param name
     * @return
     */
    public String sayHello(String  name);
}
