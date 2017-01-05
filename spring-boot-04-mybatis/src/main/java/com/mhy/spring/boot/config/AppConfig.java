package com.mhy.spring.boot.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author mahaiyuan
 * @ClassName: AppConfig
 * @date 2017-01-05 下午4:35
 */
@Configuration
@MapperScan("com.mhy.spring.boot.mapper")
public class AppConfig {
}
