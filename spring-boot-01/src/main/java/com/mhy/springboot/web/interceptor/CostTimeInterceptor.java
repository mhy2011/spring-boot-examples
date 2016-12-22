package com.mhy.springboot.web.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 运行耗时拦截器
 * @author mahaiyuan
 * @ClassName: CostTimeInterceptor
 * @date 2016-12-22 下午9:37
 */
public class CostTimeInterceptor extends HandlerInterceptorAdapter {

  private static final Logger LOGGER = LoggerFactory.getLogger("RUNTIME");

  private static final String START_TIME_KEY = "startTime";

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    request.setAttribute(START_TIME_KEY, System.currentTimeMillis());
    return true;
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    long startTime = (long) request.getAttribute(START_TIME_KEY);
    long costTime = System.currentTimeMillis() - startTime; //耗时
    LOGGER.info("uri:{},costTime:{}", request.getRequestURI(), costTime);
    request.removeAttribute(START_TIME_KEY);
  }
}
