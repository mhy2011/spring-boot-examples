package com.mhy.springboot.service;

import org.springframework.stereotype.Service;

import java.text.MessageFormat;

/**
 * @author mahaiyuan
 * @ClassName: StudentService
 * @date 2016-12-16 上午10:01
 */
@Service
public class StudentService {
  public void sayHello(String name) {
    System.out.println(MessageFormat.format("Student Hello {0}", name));
  }
}
