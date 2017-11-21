package com.ying.js.car.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ying.js.car.dao.mapper.ConsumerDAO;
import com.ying.js.car.dao.model.ConsumerDO;
import com.ying.js.car.service.ConsumerService;
import com.ying.js.car.service.ConsumerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.WebContext;

/**
 * Created by IntelliJ IDEA.
 * User: chengjing
 * Date: 17/11/14
 * Time: 上午9:17
 * CopyRight: taobao
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
