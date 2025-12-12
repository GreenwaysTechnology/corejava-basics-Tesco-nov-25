package org.tesco.hasa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXMLConfig {
    public static void main(String[] args) {
        //Read bean definitions from the spring container
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //read bean
        Employee employee = context.getBean(Employee.class);
//        employee.setName("Ram");
        System.out.println(employee);
    }
}
