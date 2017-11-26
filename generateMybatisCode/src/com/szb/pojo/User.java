package com.szb.pojo;

import java.util.Date;
import com.sun.jmx.snmp.Timestamp;

public class User {
    private String id;

    private String userName;

    private String telephone;

    private String shopAddress;

    private String homeAddress;

    private String userType;

    private String chatId;

    private String shopName;

    private String qrCodeAddress;

    private String headPortraitAddress;

    private String nickName;

    private Timestamp registTime;

    private Timestamp changeTime;

    public void setId(String id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setQrCodeAddress(String qrCodeAddress) {
        this.qrCodeAddress = qrCodeAddress;
    }

    public void setHeadPortraitAddress(String headPortraitAddress) {
        this.headPortraitAddress = headPortraitAddress;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setRegistTime(Timestamp registTime) {
        this.registTime = registTime;
    }

    public void setChangeTime(Timestamp changeTime) {
        this.changeTime = changeTime;
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getUserType() {
        return userType;
    }

    public String getChatId() {
        return chatId;
    }

    public String getShopName() {
        return shopName;
    }

    public String getQrCodeAddress() {
        return qrCodeAddress;
    }

    public String getHeadPortraitAddress() {
        return headPortraitAddress;
    }

    public String getNickName() {
        return nickName;
    }

    public Timestamp getRegistTime() {
        return registTime;
    }

    public Timestamp getChangeTime() {
        return changeTime;
    }
}