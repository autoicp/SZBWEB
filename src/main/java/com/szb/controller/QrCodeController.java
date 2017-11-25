package com.szb.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.szb.pojo.User;
import com.szb.service.UserService;

@SuppressWarnings("restriction")
@Controller
@RequestMapping("/qrCode")
public class QrCodeController{

	@Resource
	private UserService userService;
	
	@RequestMapping(value="/upload",method=RequestMethod.GET)
	public String handleRequest(HttpServletRequest request,Model model) {
		// TODO Auto-generated method stub
		String message = "去传收款码图片吧！";
		Logger logger = Logger.getLogger(this.getClass());
		logger.debug(message);
		return "qrCodeUpload";
	}
    @SuppressWarnings("deprecation")
	@RequestMapping(value="/doUpload",method=RequestMethod.POST)
    public String handleRequest2(@RequestParam("file") MultipartFile file,HttpServletRequest req) throws IOException {
    	// TODO Auto-generated method stub
//    	int date = Math.round((System.currentTimeMillis()/(1000*60*60*24)));
    	String chatId = req.getParameter("chatId");
    	Logger logger = Logger.getLogger(this.getClass());
    	logger.debug("此处为零时替换》》》》》》》》》》》》》》》》》》");
    	chatId = "小红1900";
    	User user = this.userService.selectByChatId(chatId);
    	String id = user.getId();
    	Date date = new Date(System.currentTimeMillis());
    	
    	FileUtils.copyInputStreamToFile(file.getInputStream(), new File("D:\\qrCode\\"+date.toLocaleString().split(" ")[0]+"\\",id+"."+file.getOriginalFilename().split("\\.")[1]));
    	String message = "上传完了奥~";
    	logger.debug(message);
    	req.setAttribute("uuid", id);
    	return "success";
    }

	
}
