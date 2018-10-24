package com.baizhi.controller;

import com.baizhi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 王云博 on 2018/10/23.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/login")
    @ResponseBody
    public Map login(String name, String password, String enCode, HttpServletRequest httpServletRequest) {
        Map map = new HashMap();
        boolean isLogin = adminService.login(name, password);

        String captchaId = (String) httpServletRequest.getSession().getAttribute("vrifyCode");
        System.out.println(enCode + "@@@@@@@@@@@@");
        System.out.println(captchaId + "##########");
        if (enCode.equalsIgnoreCase(captchaId)) {
            map.put("isLogin", isLogin);
        } else {
            map.put("isLogin", false);
        }
        return map;
    }
}
