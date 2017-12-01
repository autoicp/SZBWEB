package com.szb.controller;  
  
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
  
import com.szb.pojo.User;  
import com.szb.service.UserService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.net.URLEncoder;

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
	public String usercenter(HttpServletRequest request){
		return "usercenter";
	}

	/**
	 * 注册用户
	 * @param request
	 * @return
	 */
	@RequestMapping("/usercenterdo")
	public String usercenterdo(@RequestParam("qrCode") MultipartFile qrCode, @ModelAttribute("user") User user, HttpServletRequest request){

		String insertResult = this.userService.insert(user,qrCode);

        request.setAttribute("message",insertResult);

        if (insertResult.startsWith("failed")){
            return "failed";
        }else {
            return "success";
        }
    }

    public String deleteByPrimaryKey(String id){

	    //todo 删除用户
	    return "";
    }

    /**
     * 获取code
     * @param request
     * @return
     */
    @RequestMapping("getCode")
    public ModelAndView getCode(HttpServletRequest request){

        String appid = "?appid="+"填写公众号的唯一标识";//todo 填写公众号的唯一标识
        String redirect_uri = "qqq填写回调地址qqq";//todo 填写回调地址
        redirect_uri = "&redirect_uri="+ URLEncoder.encode(redirect_uri);
        String response_type = "&response_type=code";//获取code
        String scope = "&scope=snsapi_userinfo";//如果只获取openid则选snsapi_base
        String wechat_redirect = "#wechat_redirect";
        String preView = "https://open.weixin.qq.com/connect/oauth2/authorize";
        String view = appid + redirect_uri + response_type + scope + wechat_redirect;
        String url = preView+view;
        return new ModelAndView(new RedirectView(url));
    }

    /**
     * 通过code获取网页授权access_token
     * @param request
     * @return
     */
    @RequestMapping("getAccess_token")
    public ModelAndView getAccess_token(HttpServletRequest request){

        String appid = "?appid="+"填写公众号的唯一标识";//todo 填写公众号的唯一标识
        String secret = "&secret=qqq公众号的appsecretqqq";//todo 公众号的appsecret
        String code = "&code=" + request.getParameter("code");//获取到的code
        String grant_type = "&grant_type=填写为authorization_code";//填写为authorization_code

        String preView = "https://api.weixin.qq.com/sns/oauth2/access_token";
        String view = appid + secret + code + grant_type;
        String url = preView+view;
        return new ModelAndView(new RedirectView(url));
    }
}