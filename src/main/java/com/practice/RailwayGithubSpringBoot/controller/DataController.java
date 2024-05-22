package com.practice.RailwayGithubSpringBoot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/name")
public class DataController {

    @GetMapping
    public ResponseEntity<String> getName(){
        return new ResponseEntity<>("Angel Sic", HttpStatus.OK);
    }
}
