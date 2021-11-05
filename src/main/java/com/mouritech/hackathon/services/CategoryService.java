package com.mouritech.hackathon.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.mouritech.hackathon.models.Category;
import com.mouritech.hackathon.repository.CategoryRepository;

import javassist.tools.web.BadHttpRequest;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	

	
	
	public List<Category> getCategories()  {
		
		return categoryRepository.findAll();
		
	}
	
	  public Category saveCategories(Category categories) throws BadHttpRequest {
		  if(!ObjectUtils.isEmpty(categories.getCategoryId()) ) {
				throw new BadHttpRequest();
			}
	       return categoryRepository.save(categories);
	  }

}
