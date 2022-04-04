package com.mycompany.propertymanagement.controller;

import com.mycompany.propertymanagement.dto.PropertyDTO;
import com.mycompany.propertymanagement.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/* access or receive request based on  url
 request mapping can be ignored and /hello can be ignored */

@RestController
@RequestMapping("/api/v1")

public class PropertyController {
    @Autowired
    private PropertyService propertyService;

    // restful api is just a mapping of a url to a java class function
    @GetMapping("/hello")
    public String sayHello() {
        return "kshitiz, you did it !!!";
    }

    // adding an endpoint for adding property
    @PostMapping("/properties")
    public PropertyDTO saveProperty(@RequestBody PropertyDTO propertyDTO) {
        System.out.println(propertyDTO);
        return propertyDTO;
    }
}
