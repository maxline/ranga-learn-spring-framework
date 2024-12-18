package com.in28minutes.springboot.ranga_learn_spring_framework.enterprise.example.business;

import com.in28minutes.springboot.ranga_learn_spring_framework.enterprise.example.data.DataService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService {
    private final DataService dataService;

    public BusinessService(DataService dataService) {
        this.dataService = dataService;
    }

    public long calculateSum() {
        List<Integer> data = dataService.getData();
        return data.stream().reduce(Integer::sum).get();
    }
}