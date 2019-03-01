package com.wzy.controller;

import com.wzy.domain.User;
import com.wzy.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    private static Logger log = LoggerFactory.getLogger(UserController.class);
    @Resource
    private UserServiceImpl userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        System.out.println("controller userid="+userId);
        User user = userService.getUserById(userId);
        System.out.println(user.toString());
        model.addAttribute("user",user);
        return "showUser";

    }

}
