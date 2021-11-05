package com.mouritech.hackathon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.hackathon.models.Articles;
import com.mouritech.hackathon.models.Contributers;
import com.mouritech.hackathon.models.DashBoard;
import com.mouritech.hackathon.models.Topics;
import com.mouritech.hackathon.repository.ArticlesRepository;
import com.mouritech.hackathon.repository.ContributersRepository;
import com.mouritech.hackathon.repository.TopicsRepository;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api/auth")
@Api(value = "")
public class TrendingController {
	@Autowired
	private ArticlesRepository articleRepo;
	@Autowired
	private ContributersRepository contributorsRepo;
	@Autowired
	private TopicsRepository topicsRepo;
	


	@PostMapping("/topics")
	public String createTopic(@RequestBody List<Topics> topics) {
		topicsRepo.saveAll(topics);
		return "topics saved successfully";
	}
	@PostMapping("/contributers")
	public String createContributers(@RequestBody List<Contributers> contributors) {
		contributorsRepo.saveAll(contributors);
		return "contributors object saved successfully";
	}

	@PostMapping("/articles")	
	public String createArticles(@RequestBody List<Articles> articles) {
		articleRepo.saveAll(articles);
		return "articles object saved successfully";
	}
	
	
	
	@GetMapping("/get/dashboard")
	public DashBoard getDashBoardDetails(){
		DashBoard dashBoard = new DashBoard();
		List<Articles> listArticles = articleRepo.findAll();
		
		List<Contributers> listContributors= contributorsRepo.findAll();
		List<Topics> listTopics = topicsRepo.findAll();
		dashBoard.setTrending_contributers(listContributors);
		dashBoard.setTrending_topics(listTopics);
		dashBoard.setTrending_articles(listArticles);
		
	
		return dashBoard;

	}
}
