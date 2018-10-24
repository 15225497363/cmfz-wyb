package com.baizhi.controller;

import com.baizhi.entity.Menu;
import com.baizhi.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by 王云博 on 2018/10/23.
 */
@Controller
/*@RequestMapping("/menu")*/
public class MenuController {
    @Autowired
    private MenuService menuService;

    @RequestMapping("/queryAll")
    public String queryAll(Map map) {
        List<Menu> menus = menuService.selectAll();
        map.put("menus", menus);
        return "forward:/main/main.jsp";
    }

}
