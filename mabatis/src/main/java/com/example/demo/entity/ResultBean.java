package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author zz
 * @Date 2019/7/30
 * 全局返回实体类
 */
@Data
@AllArgsConstructor
public class ResultBean<T> {
    private String respCode;
    private T data;
}
