package com.szb.service;

import com.szb.pojo.User;

public interface UserService {
	int deleteByChatId(String chatId);

    int insert(User user);

    User selectByChatId(String chatId);

    int updateByChatIdSelective(User record);
}
