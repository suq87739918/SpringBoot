package com.lov2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Component会吧这个class标记为spring bean,用于dependency injection
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In Constructor" + getClass().getSimpleName());
    }

    //define inti method
    @PostConstruct
    //@PostConstruct注解标记的方法会在bean的所有初始化工作（例如属性注入）完成后被调用。
    public void doMyStartUpStuff(){
        System.out.println("In doMyStartUpStuff():" + getClass().getSimpleName());
    }

    //define destroy method
    @PreDestroy
    //@PreDestroy注解标记的方法会在Spring容器销毁bean之前调用。
    //这提供了一个在bean被销毁前执行清理操作的机会，例如释放资源、关闭文件和网络连接等。
    public void doMyCleaningStuff(){
        System.out.println("In doMyCleaningStuff():" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
