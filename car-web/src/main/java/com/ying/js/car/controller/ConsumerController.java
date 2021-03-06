package com.ying.js.car.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ying.js.car.service.ConsumerService;
import com.ying.js.car.service.ConsumerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: chengjing
 * Date: 17/11/14
 * Time: 上午9:17
 * CopyRight: ying
 * Descrption:
 */
//@RestController
@Controller
@RequestMapping({"/consumer"})
public class ConsumerController {

    @Autowired
    ConsumerService consumerService;

/*    @RequestMapping(value = "/consumerList")
    //@ResponseBody
    public String user() {

        ConsumerVO consumerVO = consumerService.getConsumerById(1L);
        System.out.println("consumerDO=" + consumerVO);
        return "consumerList";
    }*/

    @RequestMapping("/consumerList")
    public String welcome(Map<String, Object> model) {
        ConsumerVO consumerVO = consumerService.getConsumerById(1L);
        System.out.println("consumerDO=" + consumerVO);
        List<ConsumerVO> allProducts = new ArrayList<>();
        allProducts.add(consumerVO);
        model.put("consumers", allProducts);
        return "/consumer/consumerList";
    }
}
