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

	public int deleteByChatId(String chatId) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setChatId(chatId);
//		return this.userMapper.deleteByChatId(user);
		return 1;
	}

	public int insert(User user) {
		// TODO Auto-generated method stub

		return this.userMapper.insert(user);
	}

	public User selectByChatId(String chatId) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setChatId(chatId);
//		return this.userMapper.selectByChatId(user);
		return null;
	}

	public int updateByChatIdSelective(User user) {
		// TODO Auto-generated method stub
//		return this.userMapper.updateByChatIdSelective(user);
		return 1;
	}



}
