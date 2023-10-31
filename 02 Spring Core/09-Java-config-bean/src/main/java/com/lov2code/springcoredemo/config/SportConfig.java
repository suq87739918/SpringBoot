package com.lov2code.springcoredemo.config;

import com.lov2code.springcoredemo.common.Coach;
import com.lov2code.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//只有在@Configuration下才能自定义的去定义@Bean
public class SportConfig {
    @Bean("giveThisBeanAName")
    //会SwimCoach定义为Bean，这种方法主要用在将第三方包中的方法注册为Bean，因为第三方的包通常不可以手动写入@Component注释
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
