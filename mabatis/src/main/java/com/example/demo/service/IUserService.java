package com.example.demo.service;

import com.example.demo.entity.Book;

/**
 * @Author zz
 * @Date 2019/7/30
 */

public interface IUserService {

    Book selectByPrimaryKey(Integer id);
}
