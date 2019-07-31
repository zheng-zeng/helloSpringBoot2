package com.example.demo.Handler;

import com.example.demo.entity.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author zz
 * @Date 2019/7/30
 * 全局异常处理类
 */
@ControllerAdvice
public class GlobalException {
    @ResponseBody
    @ExceptionHandler
    public ResultBean handlerException(Exception e){
        e.printStackTrace();
        System.out.println("hello");

        return new ResultBean("404","您的操作有误请稍后再试!");
    }
}
