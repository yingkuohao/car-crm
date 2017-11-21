package com.ying.js.car.controller;

import java.util.Map;

import com.ying.js.car.dao.model.UserDO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: chengjing
 * Date: 17/11/20
 * Time: 下午3:57
 * CopyRight: taobao
 * Descrption:
 */

@Controller
public class WelcomeController {
    // inject via application.properties
    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @Value("${spring.profiles.active}")
    private String env;

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        UserDO userDO = new UserDO();
        userDO.setId(1L);
        userDO.setUserName("zhangsan");
        userDO.setProfilePicture("img/favicon.png");
        userDO.setIntroduction("111");

        model.put("message", this.message);
        model.put("env", this.env);
        model.put("user", userDO);
        return "welcome";
    }
}
