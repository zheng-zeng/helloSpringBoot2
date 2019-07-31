package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zz
 * @Date 2019/7/30
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("book")
    public Book userBook(Integer id){

       Book book= userService.selectByPrimaryKey(id);
       return book;

    }
}
