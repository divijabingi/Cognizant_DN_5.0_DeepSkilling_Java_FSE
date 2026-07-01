package com.cognizant.spring_learn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.spring_learn.model.Country;

@SpringBootApplication
public class SpringLearnApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringLearnApplication.class, args);
    }

    @Override
    public void run(String... args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        
        Country india = context.getBean("india", Country.class);
        Country usa = context.getBean("usa", Country.class);
        Country japan = context.getBean("japan", Country.class);
        System.out.println("Country [Code:" + india.getCode() + "  Name:" + india.getName() + "]");
        System.out.println("Country [Code:" + japan.getCode() + "  Name:" + japan.getName() + "]");
        System.out.println("Country [Code:" + usa.getCode() + "  Name:" + usa.getName() + "]");
    }
}
