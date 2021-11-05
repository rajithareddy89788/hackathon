package com.mouritech.hackathon.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouritech.hackathon.models.Items;


public interface ItemsRepository extends JpaRepository<Items, Long> {
	//List<Items> findByCategoryId(Long categoryId);
	// Optional<Items> findByIdAndCategoryId(Long id, Long categoryId);
	
}
