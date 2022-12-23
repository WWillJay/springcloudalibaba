package com.willjay.springcloud.stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {

    @RequestMapping("/subtract")
    public String subtract(){
        System.err.println("减库存");
        return "减库存";
    }

}
