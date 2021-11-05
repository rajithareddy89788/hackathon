package com.mouritech.hackathon.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.hackathon.models.Categories;
import com.mouritech.hackathon.models.Category;
import com.mouritech.hackathon.payload.response.MessageResponse2;
import com.mouritech.hackathon.repository.CategoryRepository;
import com.mouritech.hackathon.services.CategoryService;

import io.swagger.annotations.Api;
import javassist.NotFoundException;
import javassist.tools.web.BadHttpRequest;

@RestController

@RequestMapping("/api/auth")
@Api(value = "")
public class CategoryController {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private CategoryService categoryService;

	/*@GetMapping("/categories")
	public List<Category> getCategories() {
		return categoryService.getCategories();
	}*/
	
	@GetMapping("/get/categories")
	public Categories getCategoriesDetails() {
		Categories categories=new Categories();
		List<Category> category = categoryService.getCategories();
		
		categories.setCategories(category);
		
		return categories;

	}

	@PostMapping("/categories")
	public Category createCategory(@Valid @RequestBody Category categories) throws BadHttpRequest {
		
		return categoryService.saveCategories(categories);
	}

}