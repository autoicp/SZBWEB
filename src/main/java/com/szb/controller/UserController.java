package com.szb.controller;  
  
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

import org.apache.commons.io.FileUtils;
import org.apache.ibatis.io.Resources;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
  
import com.szb.pojo.User;  
import com.szb.service.UserService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@SuppressWarnings("restriction")
@Controller  
@RequestMapping("/user")  
public class UserController {  
    @Resource  
    private UserService userService;

	/**
	 * 提供注册入口
	 * @param request
	 * @return
	 */
	@RequestMapping("/usercenter")
	public String toIndex1(HttpServletRequest request){
		return "usercenter";
	}

	/**
	 * 注册用户
	 * @param request
	 * @return
	 */
	@RequestMapping("/usercenterdo")
	public String toIndex2(@RequestParam("qrCode") MultipartFile qrCode, HttpServletRequest request){
		String userName = request.getParameter("userName");
		String telephone = request.getParameter("telephone");
		String shopName = request.getParameter("shopName");
		String shopAddress = request.getParameter("shopAddress");

		Long currentTime = System.currentTimeMillis();
		Timestamp registTime = new Timestamp(currentTime);

		User user = new User();
		user.setUserName(userName);
		user.setTelephone(telephone);
		user.setShopName(shopName);
		user.setShopAddress(shopAddress);
		user.setRegistTime(registTime);
		this.userService.insert(user);
		user = this.userService.selectBySelective(user);
		//TODO 收钱码地址暂定为D:\Program Files\tomcat\apache-tomcat-8.0.20\bin\6dc5e11f-d28a-11e7-8d04-e8039a352be6.jpg
		try {
			FileUtils.copyInputStreamToFile(qrCode.getInputStream(),new File(new File("").getCanonicalPath()+"\\"+user.getId()+"."+qrCode.getOriginalFilename().split("\\.")[1]));
		} catch (IOException e) {
			e.printStackTrace();
			request.setAttribute("message","上传失败");
			return "failed";
		}

		request.setAttribute("message" ,"insert success");
		return "success";
	}

}