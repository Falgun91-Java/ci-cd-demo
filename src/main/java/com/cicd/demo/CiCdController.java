package com.cicd.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CiCdController {

    @GetMapping("/cicd")
    public String helloCiCd(){

        return "I am Learning CI CD pipeline with exact workflow";
    }
}