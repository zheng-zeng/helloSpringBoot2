package com.example.demo.config;

import com.example.demo.intercptor.AuthIntercptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author zz
 * @Date 2019/7/29
 */
@Configuration
public class WebMvcConfig  implements WebMvcConfigurer {
    @Autowired
    private AuthIntercptor authIntercptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authIntercptor).addPathPatterns("/**");
    }
}
