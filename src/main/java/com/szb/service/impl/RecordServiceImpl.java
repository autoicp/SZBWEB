package com.szb.service.impl;

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
