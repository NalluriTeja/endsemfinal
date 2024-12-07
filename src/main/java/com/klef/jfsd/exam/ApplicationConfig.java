package com.klef.jfsd.exam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public Employee employee() {
        return new Employee();
    }

    @Bean
    public Course course() {
        return new Course();
    }

    @Bean
    public Instructor instructor() {
        return new Instructor();
    }
}
