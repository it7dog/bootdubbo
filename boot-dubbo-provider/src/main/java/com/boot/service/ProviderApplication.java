package com.boot.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

/**
 * @author: wangw
 * @date: 2018/6/7 10:32
 * @description:
 */
@SpringBootApplication
@ImportResource({"classpath:config/spring-dubbo.xml"})
public class ProviderApplication {
  public static void main(String[] args) {
    SpringApplication.run(ProviderApplication.class, args);
    try {
      System.in.read();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
