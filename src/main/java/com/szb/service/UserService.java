package com.szb.service;

import com.szb.pojo.User;

public interface UserService {
    public int deleteByPrimaryKey(String id);

    public int insert(User user);

    public User selectByPrimaryKey(String id);

    public User selectBySelective(User user);

    public int updateByPrimaryKeySelective(User user);
}
