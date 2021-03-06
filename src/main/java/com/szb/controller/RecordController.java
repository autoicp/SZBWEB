package com.szb.controller;

import com.szb.pojo.Record;
import com.szb.pojo.User;
import com.szb.service.RecordService;
import com.szb.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/11/25.
 */
@SuppressWarnings("restriction")
@Controller
@RequestMapping("/record")
public class RecordController {

    @Resource
    private RecordService recordService;


    /**
     *提供记账入口
     * @param request
     * @return
     */
    @RequestMapping("/account")
    public String account(HttpServletRequest request){
        return "account";
    }

    /**
     * 记账
     * @param request
     * @return
     */
    @RequestMapping("/accountdo")
    public String accountdo(@ModelAttribute("record") Record record, HttpServletRequest request){

        this.recordService.insert(record);

        return "accountsuccess";
    }

    /**
     *提供账单确认入口
     * @param request
     * @return
     */
    @RequestMapping("/accountconfirm")
    public String accountconfirm(HttpServletRequest request){
        return "accountconfirm";
    }

    /**
     *账单确认
     * @param request
     * @return
     */
    @RequestMapping("/accountconfirmdo")
    public String accountconfirmdo(HttpServletRequest request){

        //TODO 账单确认（还需添加if、else实现账单取消）
        return "accountconfsuc";
    }
    /**
     *账单催收
     * @param request
     * @return
     */
    @RequestMapping("/collection")
    public String accountconfsuc(HttpServletRequest request){

        //TODO 账单催收
        return "collectionsuc";
    }

    /**
     *账单列表
     * @param request
     */
    @RequestMapping("/debtlist")
    public String debtlist(HttpServletRequest request){

        //TODO 账单列表（把账单信息存到request里）,注意有代收账款和已收账款，看是否需要两个方法
        return "debtlist";
    }

    /**
     *账单详情
     * @param request
     */
    @RequestMapping("/debtdetail")
    public String debtdetail(HttpServletRequest request){

        //TODO 账单详情（把账单信息存到request里）
        return "debtdetail";
    }

    /**
     *已支付账单详情
     * @param request
     */
    @RequestMapping("/haspaid")
    public String haspaid(HttpServletRequest request){

        //TODO 已支付账单详情（把账单信息存到request里）
        return "haspaid";
    }

    /**
     *已收账单详情
     * @param request
     */
    @RequestMapping("/paiddetail")
    public String paiddetail(HttpServletRequest request){

        //TODO 已收账单详情（把账单信息存到request里）
        return "paiddetail";
    }

    /**
     *支付入口
     * @param request
     */
    @RequestMapping("/pay")
    public String pay(HttpServletRequest request){

        //TODO 把账单信息存到request里，收款码等的展示
        return "pay";
    }

    /**
     *待支付入口，提供支付信息
     * @param request
     */
    @RequestMapping("/topay")
    public String topay(HttpServletRequest request,@ModelAttribute("record") Record record){

        //TODO 把账单信息存到request里
        return "topay";
    }

    @RequestMapping("/accountsuccess")
    public String accountsuccess(HttpServletRequest request, @ModelAttribute("record") Record record) {
        //todo 账单创建成功页 获取1、卖家hostUuid  2、订单ID 需确认record是否能获取
        request.setAttribute("record",record);
        return "accountsuccess";
    }

    @RequestMapping("/accountsuccessdo")
    public String accountsuccessdo(HttpServletRequest request, @ModelAttribute("record") Record record) {
        //todo 账单创建成功页 获取1、卖家hostUuid  2、订单ID 需确认record是否能获取
        record.setCheckStatus("1");
        this.recordService.updateByPrimaryKeySelective(record);
        return "accountsuccessdo";
    }
}
