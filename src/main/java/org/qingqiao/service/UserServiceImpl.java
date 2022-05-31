package org.qingqiao.service;

import org.qingqiao.bean.User;
import org.qingqiao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper mapper;
    @Override
    public List<User> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public int add(User user) {
        return mapper.add(user);
    }
}
