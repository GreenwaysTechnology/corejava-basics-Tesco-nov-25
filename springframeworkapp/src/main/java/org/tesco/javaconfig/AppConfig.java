package org.tesco.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//beans.xml
@Configuration
public class AppConfig {

    //create java objects and like <bean> definitions in beans.xml
    @Bean
    public Address address() {
        return new Address("Coimbatore");
    }

    @Bean
    public Employee employee() {
        return new Employee();
    }

}
