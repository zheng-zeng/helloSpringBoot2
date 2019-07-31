package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author zz
 * @Date 2019/7/30
 */

@Controller
@RequestMapping("user")
public class templatesController {
    @Autowired
    private IUserService userService;
    @RequestMapping("getId")
    public String userBook(Integer id, ModelMap modelMap){

       Book book= userService.selectByPrimaryKey(id);

       modelMap.addAttribute("user",book);
       return "hello";

    }
}
