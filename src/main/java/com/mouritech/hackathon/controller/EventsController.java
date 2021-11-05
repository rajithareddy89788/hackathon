package com.mouritech.hackathon.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.hackathon.models.Categoriees;
import com.mouritech.hackathon.models.Category1;
import com.mouritech.hackathon.models.LatestEvents;
import com.mouritech.hackathon.repository.Category1Repository;
import com.mouritech.hackathon.repository.LatestEventsRepository;

import io.swagger.annotations.Api;
import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping("/api/auth")
@Api(value = "")
public class EventsController {
	
	@Autowired
	private LatestEventsRepository  latestEventsRepository;
	
	@Autowired
	private Category1Repository  categoryRepository;
	


	
	@PostMapping("/latestevents")
	public String createLatestEvents(@RequestBody List<LatestEvents> latestEvents) {
		latestEventsRepository.saveAll(latestEvents);
		return "contributors object saved successfully";
	}
	@PostMapping("/category1")
	public String createCategory(@RequestBody List<Category1> category) {
	categoryRepository.saveAll(category);
		return "contributors object saved successfully";
	}
	
	@GetMapping("/get/categories1")
	public Categoriees getCategoriesDetails(){
		Categoriees categories=new Categoriees();
		List<Category1> category = categoryRepository.findAll();
		
		categories.setCategories(category);
		
		return categories;

	}

	

	}
	
	
	
	

