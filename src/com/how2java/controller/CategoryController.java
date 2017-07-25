package com.how2java.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;


@Controller
@RequestMapping("/user")
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	@RequestMapping("/showList")
	 public String showList(HttpServletRequest request,Model model){
		List<Category> list=categoryService.list();
		model.addAttribute("userList", list);
		request.setAttribute("userList", list);
		
		return "/listCategory";
		 
	 }
	
}
