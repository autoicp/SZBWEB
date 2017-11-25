package com.szb.controller;

import com.szb.pojo.User;
import com.szb.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;

@SuppressWarnings("restriction")
@Controller
@RequestMapping("/test")
public class TestController {
    @Resource
    private UserService userService;

    @RequestMapping("/account")
    public String toIndex41(HttpServletRequest request, Model model) {
        return "account";
    }

    @RequestMapping("/accountconfirm")
    public String toIndex42(HttpServletRequest request, Model model) {
        return "accountconfirm";
    }

    @RequestMapping("/accountconfsuc")
    public String toIndex43(HttpServletRequest request, Model model) {
        return "accountconfsuc";
    }

    @RequestMapping("/accountsuccess")
    public String toIndex44(HttpServletRequest request, Model model) {
        return "accountsuccess";
    }

    @RequestMapping("/collectionsuc")
    public String toIndex45(HttpServletRequest request, Model model) {
        return "collectionsuc";
    }

    @RequestMapping("/debtdetail")
    public String toIndex46(HttpServletRequest request, Model model) {
        return "debtdetail";
    }

    @RequestMapping("/debtlist")
    public String toIndex47(HttpServletRequest request, Model model) {
        return "debtlist";
    }

    @RequestMapping("/haspaid")
    public String toIndex48(HttpServletRequest request, Model model) {
        return "haspaid";
    }

    @RequestMapping("/paiddetail")
    public String toIndex49(HttpServletRequest request, Model model) {
        return "paiddetail";
    }

    @RequestMapping("/pay")
    public String toIndex411(HttpServletRequest request, Model model) {
        return "pay";
    }

    @RequestMapping("/qrCodeUpload")
    public String toIndex412(HttpServletRequest request, Model model) {
        return "qrCodeUpload";
    }

    @RequestMapping("/showUser")
    public String toIndex413(HttpServletRequest request, Model model) {
        return "showUser";
    }

    @RequestMapping("/topay")
    public String toIndex414(HttpServletRequest request, Model model) {
        return "topay";
    }

    @RequestMapping("/usercenter")
    public String toIndex415(HttpServletRequest request, Model model) {
        return "usercenter";
    }
    /*http://localhost:8080/szb/test/account
http://localhost:8080/szb/test/accountconfirm
http://localhost:8080/szb/test/accountconfsuc
http://localhost:8080/szb/test/accountsuccess
http://localhost:8080/szb/test/collectionsuc
http://localhost:8080/szb/test/debtdetail
http://localhost:8080/szb/test/debtlist
http://localhost:8080/szb/test/haspaid
http://localhost:8080/szb/test/paiddetail
http://localhost:8080/szb/test/pay
http://localhost:8080/szb/test/topay
http://localhost:8080/szb/test/usercenter*/
}