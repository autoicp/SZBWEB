package com.szb.service;

import java.util.List;

import com.szb.pojo.Record;


public interface RecordService {

	int deleteByHostChatIdAndFloatNum(String hostChatId, String floatNum);

    int insert(Record record);

    int updateByHostChatIdAndFloatNumSelective(Record record);

    List<Record> selectByHostChatIdAndPaymentStatus(String hostChatId, String paymentStatus);
    
    Record selectByHostChatIdAndFloatNum(String hostChatId, String floatNum);
    
    List<Record> selectByCustChatIdAndPaymentStatus(String custChatId, String paymentStatus);
}