package com.szb.dao;

import com.szb.pojo.Record;

import java.util.List;

public interface RecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(Record record);

    Record selectByPrimaryKey(String id);

    List<Record> selectBySelective(Record record);

    int updateByPrimaryKeySelective(Record record);

}