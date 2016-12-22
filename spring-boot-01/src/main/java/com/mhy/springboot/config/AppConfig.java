package com.mhy.springboot.config;

import com.mhy.springboot.web.interceptor.CostTimeInterceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * 配置类
 * @author mahaiyuan
 * @ClassName: AppConfig
 * @date 2016-12-22 下午8:50
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.mhy.springboot")
public class AppConfig extends WebMvcConfigurerAdapter {

  @Bean
  public InternalResourceViewResolver viewResolver() {
    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
    viewResolver.setPrefix("/WEB-INF/classes/jsp/");
    viewResolver.setSuffix(".jsp");
    viewResolver.setViewClass(JstlView.class);
    return viewResolver;
  }

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new CostTimeInterceptor()); //增加拦截器
  }
}
