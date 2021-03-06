package com.mhy.spring.boot.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class DruidConfig {
  @Bean
  public ServletRegistrationBean druidServlet() {
    ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
    servletRegistrationBean.addInitParameter("loginUsername", "admin");
    servletRegistrationBean.addInitParameter("loginPassword", "admin");
    return servletRegistrationBean;
  }

  @Bean
  public DataSource druidDataSource(@Value("${spring.datasource.driverClassName}") String driver,
                                    @Value("${spring.datasource.url}") String url,
                                    @Value("${spring.datasource.username}") String username,
                                    @Value("${spring.datasource.password}") String password) {
    DruidDataSource druidDataSource = new DruidDataSource();
    druidDataSource.setDriverClassName(driver);
    druidDataSource.setUrl(url);
    druidDataSource.setUsername(username);
    druidDataSource.setPassword(password);
    try {
      druidDataSource.setFilters("stat, wall");
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return druidDataSource;
  }

  @Bean
  public FilterRegistrationBean filterRegistrationBean() {
    FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
    filterRegistrationBean.setFilter(new WebStatFilter());
    filterRegistrationBean.addUrlPatterns("/*");
    filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
    return filterRegistrationBean;
  }
}