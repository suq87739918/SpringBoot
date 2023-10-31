package com.lov2code.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
//@Lazy this bean will not be initialized，除非被特殊指定在什么地方这个bean需要被加载
//@Primary
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("In Constructor" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K!";
    }
}
