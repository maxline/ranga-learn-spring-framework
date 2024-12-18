package com.in28minutes.springboot.ranga_learn_spring_framework.enterprise.example.web;

import com.in28minutes.springboot.ranga_learn_spring_framework.enterprise.example.business.BusinessService;
import org.springframework.stereotype.Component;


@Component
public class MyWebController {
    private final BusinessService businessService;

    public MyWebController(BusinessService businessService) {
        this.businessService = businessService;
    }

    public long returnValueFromBusinessService() {
        return businessService.calculateSum();
    }
}
