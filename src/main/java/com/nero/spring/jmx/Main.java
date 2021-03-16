package com.nero.spring.jmx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ////创建Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //获取指定名称的bean
        Book book = applicationContext.getBean("book", Book.class);
        System.out.println(book.getName());

        Thread.sleep(Integer.MAX_VALUE);
    }
}
