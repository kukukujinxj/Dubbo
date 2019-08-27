package com.example.orderserviceconsumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.OrderService;

public class MainApplication {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
        OrderService orderService = context.getBean(OrderService.class);
        orderService.initOrder("1");
        System.in.read();
    }
}
