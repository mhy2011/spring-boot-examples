package com.mhy.springboot.config;

import com.mhy.springboot.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author mahaiyuan
 * @ClassName: AppConfig
 * @date 2016-12-16 上午9:49
 */
@Configuration  //声明本类为一个配置类
public class AppConfig {

  @Bean
  public UserService userService() {
    return new UserService();
  }
}
