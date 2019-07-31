package com.example.demo.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author zz
 * @Date 2019/7/29
 */
@Component
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.err.println("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.err.println("过滤器放行");
        filterChain.doFilter(servletRequest,servletResponse);

    }

    @Override
    public void destroy() {
    System.err.println("过滤器销毁");
    }
}
