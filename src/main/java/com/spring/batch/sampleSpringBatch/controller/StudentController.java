package com.spring.batch.sampleSpringBatch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

   @GetMapping("/students")
public String getStudents(){
    return  "Hello Students";
}
}
