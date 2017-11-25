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
	/* (non-Javadoc)
	 * @see com.szb.service.impl.IRecordService#getRecordById(java.lang.String)
	 */

	public int deleteByHostChatIdAndFloatNum(String hostChatId, String floatNum) {
		// TODO Auto-generated method stub
		Record record = new Record();
		record.setHostChatId(hostChatId);
		record.setFloatNum(floatNum);
//		return this.recordMapper.deleteByHostChatIdAndFloatNum(record);
		return 1;
	}

	public int insert(Record record) {
		// TODO Auto-generated method stub
		return this.recordMapper.insert(record);
	}

	public List<Record> selectByCustChatIdAndPaymentStatus(String custChatId,
			String paymentStatus) {
		// TODO Auto-generated method stub
		Record record = new Record();
		record.setCustChatId(custChatId);
		record.setPaymentStatus(paymentStatus);
//		return (List<Record>) this.recordMapper.selectByCustChatIdAndPaymentStatus(record);
		return null;
	}

	public Record selectByHostChatIdAndFloatNum(String hostChatId,
			String floatNum) {
		// TODO Auto-generated method stub
		Record record = new Record();
		record.setHostChatId(hostChatId);
		record.setFloatNum(floatNum);
//		return this.recordMapper.selectByHostChatIdAndFloatNum(record);
		return null;
	}

	public List<Record> selectByHostChatIdAndPaymentStatus(String hostChatId,
			String paymentStatus) {
		// TODO Auto-generated method stub
		Record record = new Record();
		record.setHostChatId(hostChatId);
		record.setPaymentStatus(paymentStatus);
//		return (List<Record>) this.recordMapper.selectByHostChatIdAndPaymentStatus(record);
		return null;
	}

	public int updateByHostChatIdAndFloatNumSelective(Record record) {
		// TODO Auto-generated method stub
//		return this.recordMapper.updateByHostChatIdAndFloatNumSelective(record);
		return 1;
	}

}
