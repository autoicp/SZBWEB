package com.szb.service.impl;

import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;

import com.szb.dao.UserMapper;
import com.szb.pojo.User;
import com.szb.service.UserService;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

@SuppressWarnings("restriction")
@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
    private UserMapper userMapper;

	public int deleteByPrimaryKey(String id) {
		return this.userMapper.deleteByPrimaryKey(id);
	}

	public String insert(User user,MultipartFile qrCode) {
        Long currentTime = System.currentTimeMillis();
        Timestamp registTime = new Timestamp(currentTime);

        user.setRegistTime(registTime);

        int insertResult = this.userMapper.insert(user);
        user = this.userMapper.selectBySelective(user);
        String result = "";

        if (insertResult==0){
            result = result + "failed,信息添加失败，请重试";
        }else {
            result = result + "success,信息添加完成";
        }

        try {
            //TODO 收钱码地址暂定为D:\Program Files\tomcat\apache-tomcat-8.0.20\bin\6dc5e11f-d28a-11e7-8d04-e8039a352be6.jpg
            FileUtils.copyInputStreamToFile(qrCode.getInputStream(),new File(new File("").getCanonicalPath()+"\\"+user.getId()+"."+qrCode.getOriginalFilename().split("\\.")[1]));
            result= result + "success,收钱码上传成功";
        } catch (IOException e) {
            e.printStackTrace();
            result= "failed,收钱码上传失败";
        }
        if (result.contains("failed")){
            return "failed"+result;
        }else {
            return "success"+result;
        }

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
