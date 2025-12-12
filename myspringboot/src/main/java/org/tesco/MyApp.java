package org.tesco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyApp {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyApp.class, args);
        Employee employee = context.getBean(Employee.class);
        employee.setId(1);
        employee.setName("Subramaian");
        employee.getAddress().setCity("Coimbatore");
        System.out.println(employee);
    }

}
