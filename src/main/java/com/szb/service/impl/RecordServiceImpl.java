package com.szb.service.impl;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.szb.dao.RecordMapper;
import com.szb.pojo.Record;
import com.szb.service.RecordService;

@SuppressWarnings("restriction")
@Service("recordService")
public class RecordServiceImpl implements RecordService {

	@Resource
	private RecordMapper recordMapper;

	public int deleteByPrimaryKey(String id) {
		return this.recordMapper.deleteByPrimaryKey(id);
	}

	public int insert(Record record) {
        //获取业务发生时间，即当前系统时间
        Long currentTime = System.currentTimeMillis();
        Timestamp occurTime = new Timestamp(currentTime);
        record.setOccurTime(occurTime);

        //获取应还款日
        String[] predate = record.getDuePayDate().toString().split("-");
        int year = Integer.parseInt(predate[0])-1900;
        int month = Integer.parseInt(predate[1])-1;
        int day = Integer.parseInt(predate[2])+1;
        record.setDuePayDate(new Date(year,month,day));

        //存储账单
        return this.recordMapper.insert(record);
	}

	public Record selectByPrimaryKey(String id) {
		return this.recordMapper.selectByPrimaryKey(id);
	}

	public List<Record> selectBySelective(Record record) {
		return this.recordMapper.selectBySelective(record);
	}

	public int updateByPrimaryKeySelective(Record record) {
		return this.updateByPrimaryKeySelective(record);
	}
}
