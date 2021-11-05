package com.mouritech.hackathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouritech.hackathon.models.Articles;



public interface ArticlesRepository extends JpaRepository<Articles, Integer> {

}
