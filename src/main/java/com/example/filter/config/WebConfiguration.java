package com.example.filter.config;

import com.example.filter.filter.MyFilterOne;
import com.example.filter.filter.MyFilterTwo;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {

    @Bean
    public FilterRegistrationBean<MyFilterOne> registrationOne(){

        FilterRegistrationBean<MyFilterOne> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new MyFilterOne());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("MyFilterOne");
        registrationBean.setOrder(6);
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean<MyFilterTwo> registrationTwo(){

        FilterRegistrationBean<MyFilterTwo> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new MyFilterTwo());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("MyFilterTwo");
        registrationBean.setOrder(1);
        return registrationBean;
    }
}
