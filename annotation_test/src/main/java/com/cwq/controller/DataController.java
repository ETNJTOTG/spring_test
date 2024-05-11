package com.cwq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenw  2024-05-11 15:37
 **/
@RestController
@RequestMapping("/data")
public class DataController {

    @GetMapping(value = {"/", "/hello"})
    public String hello() {
        return "hello";
    }
}
