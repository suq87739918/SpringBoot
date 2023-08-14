package com.yueqian.springboot.demo.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //inject custom application properties
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    //expose new endpoint for teaminfo
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach:" + coachName + "," + "Team: " + teamName;
    }

    //expose "/" and display "Hello World"
    @GetMapping
    public String sayHello(){
        return "Hello World";
    }

    //expose a new endpoint for workout
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5K!";
    }
}
