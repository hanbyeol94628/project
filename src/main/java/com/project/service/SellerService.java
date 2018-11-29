package com.project.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.project.domain.SellerVO;
import com.project.mapper.SellerMapper;

@Service("com.project.service.SellerService")
public class SellerService {

	@Resource(name="com.project.mapper.SellerMapper")
	SellerMapper sellerMapper;
	
	public SellerService(SellerMapper sellerMapper) {
		this.sellerMapper = sellerMapper;
	}
	
	public SellerVO getInfo(int sellerNum) throws Exception{
		return sellerMapper.getInfo(sellerNum);
	}
	
}
