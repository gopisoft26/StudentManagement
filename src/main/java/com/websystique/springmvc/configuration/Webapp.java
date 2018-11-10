package com.websystique.springmvc.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = "com.websystique.springmvc")
public class Webapp {
   public static void main(String[] args) {
      SpringApplication.run(Webapp.class, args);
   }
}
