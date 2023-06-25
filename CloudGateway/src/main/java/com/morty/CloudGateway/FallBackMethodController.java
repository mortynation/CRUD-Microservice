package com.morty.CloudGateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    public static final String USER_SERVICE = "userService";

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod(){
        return ("User Service is down! " + "Please try again some time later.");
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod(){
        return ("Department Service is down! " + "Please try again some time later.");
    }
}
