package com.kh.swith.biz;

import java.util.List;

import com.kh.swith.dto.PaymentDto;

public interface PaymentBiz {
	public List<PaymentDto> selectList(int memberid);
	public List<PaymentDto> selectListPeriod(PaymentDto dto);
	public PaymentDto selectOne(String paymentid);
	public int insert(PaymentDto dto);
	public int refund(String peymentid);
}
