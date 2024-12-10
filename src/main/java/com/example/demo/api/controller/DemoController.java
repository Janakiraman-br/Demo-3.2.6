package com.example.demo.api.controller;


import com.example.demo.api.models.UnNumber;
import com.example.demo.api.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {


    private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }


    @GetMapping("/getAll/{name}")
    public List<UnNumber> getUnNumbers(@PathVariable String name) throws Exception
    {
      return demoService.getUnNumber(name);
    }
    @GetMapping("/getAll")
    public Iterable<UnNumber> getAllUnNumbers() throws Exception {
        return demoService.getAllUnNumbers();
    }

}
