package com.mouritech.hackathon.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouritech.hackathon.models.Topics;




public interface TopicsRepository extends JpaRepository<Topics, Integer> {
	
	
}
