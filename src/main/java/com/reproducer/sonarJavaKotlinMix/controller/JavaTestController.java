package com.reproducer.sonarJavaKotlinMix.controller;

import com.reproducer.sonarJavaKotlinMix.data.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaTestController {

    @GetMapping("test")
    public Data test(){
        return new Data("a", "b", "c");
    }
}
