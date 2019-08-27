package com.example.orderserviceconsumer.service.impl;

import bean.UserAddress;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import service.OrderService;
import service.UserService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Reference
    private UserService userService;

    @HystrixCommand(fallbackMethod = "initOrderError")
    @Override
    public List<UserAddress> initOrder(String userId) {
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        return userAddressList;
    }

    public List<UserAddress> initOrderError(String userId) {
        return null;
    }
}
