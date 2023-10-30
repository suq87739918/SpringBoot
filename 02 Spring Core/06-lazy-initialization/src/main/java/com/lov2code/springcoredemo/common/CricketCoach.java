package com.lov2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
//@Component会吧这个class标记为spring bean,用于dependency injection
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In Constructor" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
