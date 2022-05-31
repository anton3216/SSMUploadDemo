package org.qingqiao.service;

import org.qingqiao.bean.User;

import java.util.List;

public interface UserService {
    List<User> queryAll();

    int add(User user);
}
