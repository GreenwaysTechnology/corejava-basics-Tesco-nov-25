package org.tesco.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = context.getBean(Employee.class);
        employee.setId(1);
        employee.setName("Subramanian Murugan");
        System.out.println(employee);
    }
}
