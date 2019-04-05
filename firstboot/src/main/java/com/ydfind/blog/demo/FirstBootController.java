package com.ydfind.blog.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ydfind
 * @create 2019-04-05 15:10
 */
@RestController
public class FirstBootController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }
}

