package com.person.management.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages = "com.person.management")
public class Webapp {
   public static void main(String[] args) {
      SpringApplication.run(Webapp.class, args);
   }
   
}
