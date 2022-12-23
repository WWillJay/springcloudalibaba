package com.willjay.springcloud.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/book")
    public String book(){
        String restResult = restTemplate.getForObject("http://localhost:8012/stock/subtract", String.class);
        System.err.println("已预定");
        return "已预定" + restResult;
    }

}
