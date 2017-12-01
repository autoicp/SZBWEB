package com.szb.controller;

import com.szb.pojo.Record;
import com.szb.service.UserService;
import com.szb.service.RecordService;
//import com.szb.wechat.utils.SignUtil;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("restriction")
@Controller
@RequestMapping("/test")
public class TestController {
    @Resource
    private UserService userService;
    @Resource
    private RecordService recordService;

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
    @RequestMapping("/testShowRecords")
    public String testShowRecords(HttpServletRequest request, Model model) {

        Record record = new Record();
        record.setProductCounts("3");
        List<Record> records = this.recordService.selectBySelective(record);
        request.setAttribute("records" ,records);
        System.out.println("");
        System.out.println("===================================="+records.toString());
        System.out.println("================time===================="+records.get(0).getOccurTime());
        System.out.println("");
        return "testShowRecords";
    }
    /*@ResponseBody
    @RequestMapping("")
    public String showResponse(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("接口测试开始！！！");
        //todo 测试用地址http://localhost:8080/szb/test?signature=656A4B5F98DB324355E21FC95E8D281EF354B1D8&timestamp=201711291&nonce=90&echostr=80
        //微信加密签名
        String signature = request.getParameter("signature");
        //时间戳
        String timestamp = request.getParameter("timestamp");
        //随机数
        String nonce = request.getParameter("nonce");
        //随机字符串
        String echostr = request.getParameter("echostr");

        //通过校验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败
        if(SignUtil.checkSignature(signature,timestamp,nonce)){
            return this.doPost(request,response);
        }else {
            return "hehe";
        }
    }*/
    /**
     * 处理微信服务器发来的消息
     */
/*
//    @RequestMapping("do")
    public String doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //消息的接受、处理、响应
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        //调用核心业务类型接受消息、处理消息
        String respMessage = ChatService.processRequest(request);

        //响应消息
//        PrintWriter out = response.getWriter();
//        out.print(respMessage);
//        out.close();

        return respMessage;
    }*/

    /*@RequestMapping("/acceptFromChat")
    public ModelAndView acceptFromChat(HttpServletRequest request, HttpServletResponse response) throws IOException {

        try {
            InputStream stream = request.getInputStream();
            InputStreamReader reader = new InputStreamReader(stream,"UTF-8");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String s = "";
            StringBuffer buffer = new StringBuffer();
            while ((s = bufferedReader.readLine())!=null){
                buffer.append(s);
            }
            String xml = buffer.toString();
            xml = "<xml><fromUserName>fromusers</fromUserName><toUserName>tousernames</toUserName><msgType>msgtypes</msgType></xml>";
            Document document = DocumentHelper.parseText(xml);
            Element root = document.getRootElement();
            Iterator<?> iterator = root.elementIterator();

            String fromUserName="";
            String toUserName ="";
            String msgType ="";

            while (iterator.hasNext()){
                Element next = (Element) iterator.next();

                if(next.getName().equals("fromUserName")){
                    fromUserName = next.getText();
                }
                if(next.getName().equals("toUserName")){
                    toUserName = next.getText();
                }
                if(next.getName().equals("msgType")){
                    msgType = next.getText();
                }
                System.out.println(next.getName()+"==============================="+next.getText());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return  new ModelAndView(new RedirectView("http://www.baidu.com"));
    }*/
    //TODO 开发完成后删除该类，该类只是测试用
}