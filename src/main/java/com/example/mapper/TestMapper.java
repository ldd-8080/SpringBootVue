package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.vo.TestVo;

@Mapper
public interface TestMapper {

	List<TestVo> getTest();

}
