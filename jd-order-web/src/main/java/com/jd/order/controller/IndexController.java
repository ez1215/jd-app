package com.jd.order.controller;

import com.jd.order.entity.Order;
import com.jd.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    private IOrderService orderService;

    @RequestMapping("/hello")
    @ResponseBody
    public String index() {
        return "hello order!";
    }

    @RequestMapping("/order")
    @ResponseBody
    public Order order(){
        return  orderService.selectByPrimaryKey(1);
    }
}
