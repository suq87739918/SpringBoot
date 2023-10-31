package com.lov2code.springcoredemo.common;

import com.lov2code.springcoredemo.common.Coach;

//因为没有被标记为@Component，所以这个class不会被识别为bean
public class SwimCoach implements Coach {

    public SwimCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1000m as a warm up";
    }
}
