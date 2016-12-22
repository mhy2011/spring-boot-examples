package com.mhy.springboot.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mahaiyuan
 * @ClassName: IndexController
 * @date 2016-12-22 下午9:00
 */
@Controller
public class IndexController {

  private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

  @RequestMapping("")
  public String index() {
    LOGGER.info("index ....................");
    return "index";
  }
}
