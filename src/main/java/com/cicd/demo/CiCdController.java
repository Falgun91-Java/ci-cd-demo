package com.cicd.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CiCdController {

    @GetMapping("/cicd")
    public String helloCiCd(){

        return "Developing Ci Cd pipeline..";
    }
}