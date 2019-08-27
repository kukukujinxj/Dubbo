package com.example.userserviceprovider.service.Impl;

import bean.UserAddress;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import service.UserService;

import java.util.Arrays;
import java.util.List;

@Service
@Component
public class UserServiceImpl implements UserService {
    @HystrixCommand
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "昌平区", "1", "小王", "13564789451", "Y");
        UserAddress address2 = new UserAddress(2, "海淀区", "1", "小李", "13567894561", "N");
        return Arrays.asList(address1, address2);
    }
}
