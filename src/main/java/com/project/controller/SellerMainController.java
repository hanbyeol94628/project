package com.project.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.domain.SellerVO;
import com.project.service.SellerService;

@Controller
public class SellerMainController {

	@Resource(name="com.project.service.SellerService")
	SellerService sellerService;
	
	public SellerMainController(SellerService sellerService) {
		this.sellerService = sellerService;
	}
	
	@RequestMapping("/")
	private String sellerMain(Model model, @RequestParam int sellerNum) throws Exception{
		sellerNum = 1;
		SellerVO sellerVO = sellerService.getInfo(sellerNum);
		model.addAttribute("seller", sellerVO);
		return "seller_main";
	}

	
}
