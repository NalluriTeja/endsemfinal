package com.klef.jfsd.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Employee employee = context.getBean(Employee.class);
        Course course = context.getBean(Course.class);

        // Test the objects
        System.out.println("Employee: " + employee);
        System.out.println("Course: " + course);
    }
}
