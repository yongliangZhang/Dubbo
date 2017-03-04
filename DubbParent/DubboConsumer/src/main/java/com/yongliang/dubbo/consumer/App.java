package com.yongliang.dubbo.consumer;

import com.yongliang.dubbo.api.HelloWordService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
       HelloWordService  service=(HelloWordService) context.getBean("demoService");
     String  name=  service.sayHello("永亮");
        System.out.println( name);
    }
}
