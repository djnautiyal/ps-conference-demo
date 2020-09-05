package com.djspring.conferencedemo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @Value("${app.version}")
    String appVersion;

    @GetMapping("/")
    public Map getStatus(){
        Map status = new HashMap<String, String>();
        status.put("app-version",appVersion);

        return status;
    }
}
