package com.szb.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.szb.dao.UserMapper;
import com.szb.pojo.User;
import com.szb.service.UserService;

@SuppressWarnings("restriction")
@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource  
    private UserMapper userMapper;

	public int deleteByPrimaryKey(String id) {
		return this.userMapper.deleteByPrimaryKey(id);
	}

	public int insert(User user) {
		return this.userMapper.insert(user);
	}

	public User selectByPrimaryKey(String id) {
		return this.userMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(User user) {
		return this.userMapper.updateByPrimaryKeySelective(user);
	}

	public User selectBySelective(User user) {
		return this.userMapper.selectBySelective(user);
	}
}
