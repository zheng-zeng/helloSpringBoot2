package com.example.demo.config;

import com.example.demo.filter.MyFilter;
import com.example.demo.listener.MyListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zz
 * @Date 2019/7/29
 */
@Configuration
public class WebConfig {
    @Autowired
     private MyFilter myFilter;
    @Autowired
    private MyListener myListener;

@Bean
public FilterRegistrationBean init(){

    FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
    filterRegistrationBean.setName("myFilter");
    filterRegistrationBean.setFilter(myFilter);
    filterRegistrationBean.addUrlPatterns("/*");
    return filterRegistrationBean;
}


    public ServletListenerRegistrationBean initListener(){
    ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean();
    servletListenerRegistrationBean.setListener(myListener);
    return servletListenerRegistrationBean;
    }
}
