package com.szb.service;

import com.szb.pojo.User;
import org.springframework.web.multipart.MultipartFile;

public interface UserService {
    public int deleteByPrimaryKey(String id);

    public String insert(User user,MultipartFile qrCode);

    public User selectByPrimaryKey(String id);

    public User selectBySelective(User user);

    public int updateByPrimaryKeySelective(User user);
}
