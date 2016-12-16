package com.mhy.springboot;

import com.mhy.springboot.config.AppConfig2;
import com.mhy.springboot.service.StudentService;
import com.mhy.springboot.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author mahaiyuan
 * @ClassName: AppMain
 * @date 2016-12-16 上午9:51
 */
public class AppMain2 {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);
    StudentService studentService = context.getBean(StudentService.class);
    studentService.sayHello("李四");
    context.close();
  }
}
