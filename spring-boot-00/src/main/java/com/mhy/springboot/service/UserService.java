package com.mhy.springboot.service;

import java.text.MessageFormat;

/**
 * @author mahaiyuan
 * @ClassName: UserService
 * @date 2016-12-16 上午9:46
 */
public class UserService {
  public void sayHello(String name) {
    System.out.println(MessageFormat.format("Hello {0}", name));
  }
}
