package com.lov2code.springcoredemo.rest;

import com.lov2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //Define a private field for dependency
    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    //这个是通过setter方法注入的
    public DemoController(
                    @Qualifier("cricketCoach") Coach theCoach,
                    @Qualifier("cricketCoach") Coach theAnotherCoach){
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "comparing bean: myCoach == anotherCoach is => " + (myCoach == anotherCoach);
    }
}
