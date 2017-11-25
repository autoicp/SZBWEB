package com.szb.controller;  
  
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.sql.Timestamp;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
  
import com.szb.pojo.User;  
import com.szb.service.UserService;  
  
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
	public String toIndex2(HttpServletRequest request){
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
		request.setAttribute("message" ,"insert success");
		return "success";
	}

}