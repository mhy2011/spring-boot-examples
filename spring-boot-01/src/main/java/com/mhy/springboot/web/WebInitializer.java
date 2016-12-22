package com.mhy.springboot.web;

import com.mhy.springboot.config.AppConfig;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Web配置
 * @author mahaiyuan
 * @ClassName: WebInitializer
 * @date 2016-12-22 下午8:55
 */
public class WebInitializer implements WebApplicationInitializer {
  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
    context.register(AppConfig.class);
    context.setServletContext(servletContext);
    ServletRegistration.Dynamic servlet = servletContext.addServlet("dipatcher",
            new DispatcherServlet(context));
    servlet.addMapping("/");
    servlet.setLoadOnStartup(1);
  }
}
