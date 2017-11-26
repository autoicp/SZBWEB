package com.szb.dao;

import com.szb.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User user);

    User selectByPrimaryKey(String id);

    User selectBySelective(User user);

    int updateByPrimaryKeySelective(User user);

}