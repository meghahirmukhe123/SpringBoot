package com.spring_security4.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo4cntroller {
	
	@GetMapping("/my-map")
    public Map<Integer, String> getMyMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Value 1");
        myMap.put(2, "Value 2");
        myMap.put(3, "Value 3");
        return myMap;
    }
}
