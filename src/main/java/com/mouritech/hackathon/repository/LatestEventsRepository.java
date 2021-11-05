package com.mouritech.hackathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouritech.hackathon.models.LatestEvents;





public interface LatestEventsRepository extends JpaRepository<LatestEvents, Integer> {

}
