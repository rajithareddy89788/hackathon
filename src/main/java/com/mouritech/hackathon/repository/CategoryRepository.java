package com.mouritech.hackathon.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.mouritech.hackathon.models.Category;



public interface CategoryRepository extends JpaRepository<Category, Long> {

}
