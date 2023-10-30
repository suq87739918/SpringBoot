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

    @Autowired
    //这个是通过setter方法注入的
    public DemoController(@Qualifier("baseballCoach") Coach theCoach){
        //因为在common中有4个class都implements了Coach这个接口，所以需要用@Qualifier来指定哪一个bean应该被注入
        //当然，也可以在这4个class中通过指定@Primary来告诉spring哪个实例应该被注入
        //需要注意，如果@Primary和@Qualifier同时使用的话，@Qualifier有更高的优先级
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
