package com.szb.controller;

import com.szb.pojo.Record;
import com.szb.pojo.User;
import com.szb.service.RecordService;
import com.szb.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String toIndex1(HttpServletRequest request){
        return "account";
    }

    /**
     * 记账
     * @param request
     * @return
     */
    @RequestMapping("/accountdo")
    public String toIndex2(HttpServletRequest request){

        //获取记账参数
        String productname = request.getParameter("productname");
        String productnum = request.getParameter("productnum");
        String totalamount = request.getParameter("totalamount");
        String payoutDate = request.getParameter("payoutDate");
        String[] predate = payoutDate.split("-");

        Long currentTime = System.currentTimeMillis();
        Timestamp occurTime = new Timestamp(currentTime);

        Record record = new Record();
        record.setProductName(productname);
        record.setProductCounts(productnum);
        record.setProductAmount(totalamount);
        record.setOccurTime(occurTime);
        record.setDuePayDate(new Date(Integer.parseInt(predate[0])-1900,Integer.parseInt(predate[1])-1,Integer.parseInt(predate[2])+1));

        this.recordService.insert(record);
        request.setAttribute("message" ,"insert success");

        Logger logger = Logger.getLogger(this.getClass());
        logger.debug("记账一次");

        return "success";
    }
}
