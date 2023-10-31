package com.lov2code.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Component会吧这个class标记为spring bean,用于dependency injection
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//Prototype scope: new object instance for each injection
//所以两个相同injection会指向不同的内存，所以他们还是不一样的，见Controller中的check
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In Constructor" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
