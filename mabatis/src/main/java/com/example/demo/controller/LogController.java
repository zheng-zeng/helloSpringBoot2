package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zz
 * @Date 2019/7/30
 */
@RestController
@Slf4j
@RequestMapping("log")
public class LogController {

 /* private   Logger logger = LoggerFactory.getLogger(LogController.class);*/
    @RequestMapping("out")
    public String out(){
        /*log.debug("debug......");
        log.info("info......");
        log.warn("warn......");
        log.error("error.....");*/

        return "ok";
    }
}
