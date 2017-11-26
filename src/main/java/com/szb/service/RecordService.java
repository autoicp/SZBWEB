package com.szb.service;

import java.util.List;

import com.szb.pojo.Record;


public interface RecordService {

    int deleteByPrimaryKey(String id);

    int insert(Record record);

    Record selectByPrimaryKey(String id);

    List<Record> selectBySelective(Record record);

    int updateByPrimaryKeySelective(Record record);
}