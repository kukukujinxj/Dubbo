package com.example.orderserviceconsumer.controller;

import bean.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.OrderService;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderServiceController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/initOrder")
    @ResponseBody
    public List<UserAddress> initOrder(String userId) {
        return orderService.initOrder(userId);
    }
}
