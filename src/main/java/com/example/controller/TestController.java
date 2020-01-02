package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.TestService;
import com.example.vo.TestVo;

@RestController
public class TestController {
	
	@Autowired TestService testService;

	/*@RequestMapping("/")
	@ResponseBody
	public String testMain() throws Exception{
		return "main";
	}
	*/
	@RequestMapping("/test")
	@ResponseBody
	public List<TestVo> getTest() throws Exception{
		return testService.getTest();
	}
}
