package com.mhy.springboot;

import com.mhy.springboot.config.AppConfig;
import com.mhy.springboot.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author mahaiyuan
 * @ClassName: AppMain
 * @date 2016-12-16 上午9:51
 */
public class AppMain {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    UserService userService = context.getBean(UserService.class);
    userService.sayHello("张三");
    context.close();
  }
}
