package com.szb.pojo;

import java.util.Date;
import com.sun.jmx.snmp.Timestamp;

public class Record {
    private String id;

    private String floatNum;

    private String hostChatId;

    private String productName;

    private String productCounts;

    private String productAmount;

    private Timestamp occurTime;

    private Date duePayDate;

    private Timestamp payoutTime;

    private String custChatId;

    private String paymentStatus;

    private String checkStatus;

    private Timestamp checkTime;

    private String hostUuid;

    private String custUuid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFloatNum() {
        return floatNum;
    }

    public void setFloatNum(String floatNum) {
        this.floatNum = floatNum == null ? null : floatNum.trim();
    }

    public String getHostChatId() {
        return hostChatId;
    }

    public void setHostChatId(String hostChatId) {
        this.hostChatId = hostChatId == null ? null : hostChatId.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductCounts() {
        return productCounts;
    }

    public void setProductCounts(String productCounts) {
        this.productCounts = productCounts == null ? null : productCounts.trim();
    }

    public String getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(String productAmount) {
        this.productAmount = productAmount == null ? null : productAmount.trim();
    }

    public Date getOccurTime() {
        return occurTime;
    }

    public void setOccurTime(Date occurTime) {
        this.occurTime = occurTime;
    }

    public Date getDuePayDate() {
        return duePayDate;
    }

    public void setDuePayDate(Date duePayDate) {
        this.duePayDate = duePayDate;
    }

    public Date getPayoutTime() {
        return payoutTime;
    }

    public void setPayoutTime(Date payoutTime) {
        this.payoutTime = payoutTime;
    }

    public String getCustChatId() {
        return custChatId;
    }

    public void setCustChatId(String custChatId) {
        this.custChatId = custChatId == null ? null : custChatId.trim();
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus == null ? null : paymentStatus.trim();
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus == null ? null : checkStatus.trim();
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getHostUuid() {
        return hostUuid;
    }

    public void setHostUuid(String hostUuid) {
        this.hostUuid = hostUuid == null ? null : hostUuid.trim();
    }

    public String getCustUuid() {
        return custUuid;
    }

    public void setCustUuid(String custUuid) {
        this.custUuid = custUuid == null ? null : custUuid.trim();
    }
}