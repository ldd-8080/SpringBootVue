package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.TestMapper;
import com.example.vo.TestVo;

@Service	
public class TestService {

	@Autowired TestMapper testMapper;
	
	public List<TestVo> getTest() throws Exception {
		return testMapper.getTest();
	}
}
