package com.how2java.mapper;

import java.util.List;

import com.how2java.pojo.Category;


public interface CategoryMapper {
	
	    public Category get(int id);  
	     public List<Category> list();
	
	    
}
