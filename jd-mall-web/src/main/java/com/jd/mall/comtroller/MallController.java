package com.jd.mall.comtroller;

import com.jd.mall.entity.Mall;
import com.jd.mall.service.IMallService;
import com.jd.order.entity.Order;
import com.jd.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class MallController {

    @Autowired
    private IOrderService orderService;

    @Autowired
    private IMallService mallService;

    @RequestMapping("/hello")
    @ResponseBody
    public String index(){
        return  "hello mall";
    }

    @RequestMapping("/order")
    @ResponseBody
    public Order order(){
        return orderService.selectByPrimaryKey(1);
    }

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(Mall mall){
        mall.setCreateTime(new Date());
        return  mallService.insertSelective(mall);
    }

    @RequestMapping("/addMall")
    public String add(){
        return "addMall";
    }

    @RequestMapping("/insertOrder")
    @ResponseBody
    public int insert(Order order){
        order.setCreateTime(new Date());
        return  orderService.insertSelective(order);
    }
}
