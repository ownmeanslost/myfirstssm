package com.how2java.service.impl;

import java.util.List;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
	@Resource
	CategoryMapper categoryMapper;

	@Override
	public Category get(int id) {
		
		return categoryMapper.get(id);
		
	}

	@Override
	public List<Category> list() {
		
		return categoryMapper.list();
		
	}

}
