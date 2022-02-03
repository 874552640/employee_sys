package com.example.employee_sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

@Controller
public class LoginController {

    @RequestMapping("/user/login")
    public String login(Model model,@RequestParam("username") String username,@RequestParam("password") String password){

        if (!StringUtils.isEmpty(username) && "123456".equals(password)){
            return "dashboard";
        }else {
            model.addAttribute("msg","用户名或密码错误！");
            return "index";
        }


    }
}
