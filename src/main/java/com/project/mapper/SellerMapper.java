package com.project.mapper;

import org.springframework.stereotype.Repository;

import com.project.domain.SellerVO;

@Repository("com.project.mapper.SellerMapper")
public interface SellerMapper {

	SellerVO getInfo(int sellerNum) throws Exception;
}
