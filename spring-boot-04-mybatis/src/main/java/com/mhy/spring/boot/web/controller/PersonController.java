package com.mhy.spring.boot.web.controller;

import com.mhy.spring.boot.mapper.PersonMapper;
import com.mhy.spring.boot.model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author mahaiyuan
 * @ClassName: PersonController
 * @date 2017-01-05 下午4:37
 */
@RestController
@RequestMapping("/person")
public class PersonController {

  @Autowired
  private PersonMapper personMapper;

  @RequestMapping("/list")
  public List<Person> list() {
    return personMapper.selectByExample(null);
  }
}
