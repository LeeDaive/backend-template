package com.ldw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ldw
 * @Classname BackendApplication
 * @Description TODO
 * @Date 2023/4/12/15:12
 */
@RestController
public class Test {

    @GetMapping("/text")
    public String text() {
        return "Hello World";
    }
}
