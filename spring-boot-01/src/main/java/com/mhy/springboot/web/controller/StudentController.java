package com.mhy.springboot.web.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * @author mahaiyuan
 * @ClassName: StudentController
 * @date 2016-12-22 下午9:47
 */
@Controller
@RequestMapping("/student")
public class StudentController {

  @RequestMapping(value = "/index", produces = MediaType.TEXT_PLAIN_VALUE)
  @ResponseBody
  public String index() {
    try {
      Random random = new Random();
      Thread.sleep(random.nextInt(1000));
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return "Hello Student";
  }
}
