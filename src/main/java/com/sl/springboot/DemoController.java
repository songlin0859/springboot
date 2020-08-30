package com.sl.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("hello/{id}")
    public String hello(@PathVariable("id") String id){
        return  "restful id ="+id;
    }
}
