package com.person.management.config.security;
import javax.servlet.Filter;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.person.management.app.WebConfig;
import com.person.management.app.Webapp;

public class MvcWebApplicationInitializer 
      extends AbstractAnnotationConfigDispatcherServletInitializer {

  // Load database and spring security configuration
  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class[] { Webapp.class, WebSecurityConfiguration.class };
  }

  // Load spring web configuration
  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class[] { WebConfig.class };
  }

  @Override
  protected String[] getServletMappings() {
    return new String[] { "/" };
  }
  
  @Override
  protected Filter[] getServletFilters() {
  	Filter [] singleton = { new CORSFilter()};
  	return singleton;
  }

}