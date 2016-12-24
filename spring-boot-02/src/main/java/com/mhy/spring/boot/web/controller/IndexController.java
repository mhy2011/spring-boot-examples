package com.mhy.spring.boot.web.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mahaiyuan
 * @ClassName: IndexController
 * @date 2016-12-24 下午4:50
 */
@RestController
public class IndexController {

  @RequestMapping(value = "", produces = MediaType.TEXT_PLAIN_VALUE)
  public String index() {
    return "OK";
  }
}
