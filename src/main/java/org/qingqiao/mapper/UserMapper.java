package org.qingqiao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.qingqiao.bean.User;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> queryAll();

    int add(User user);
}
