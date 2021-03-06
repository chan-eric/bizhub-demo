package com.bizhub.bizhub.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bizhub.bizhub.model.ResponseModel;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("test")
public class RestController {

	
	@GetMapping("/getall")
	public List<ResponseModel> getAll() {
		List<ResponseModel> result = new ArrayList<>();
		
		
		//get from database
		ResponseModel a = new ResponseModel();
		a.setId(1);
		a.setName("name1");
		a.setDesc("desc1");
		a.setPicUrl("httpurl1");
		
		ResponseModel b = new ResponseModel();
		b.setId(3);
		b.setName("name13");
		b.setDesc("desc3");
		b.setPicUrl("httpurl3");
		
		result.add(a);
		result.add(b);
		
		return result;
	}
}
