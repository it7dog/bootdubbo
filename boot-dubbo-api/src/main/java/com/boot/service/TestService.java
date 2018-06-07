package com.boot.service;

import com.boot.domain.User;

/**
 * @author: wangw
 * @date: 2018/6/7 10:23
 * @description:
 */
public interface TestService {
  String sayHello(String str);
  User findUser();
}
