package com.mouritech.hackathon.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="category12")
public class Category1 {
	@JsonIgnore
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String category_name;
	private String category_image;
	 @OneToMany( cascade = {
		        CascadeType.ALL
		    })
	 @JoinColumn(name = "id")
	  private List<LatestEvents >latestEvents;
	 @OneToMany( cascade = {
		        CascadeType.ALL
		    })
	 @JoinColumn(name = "id")
	  private List<TrendingEvents> trendingEvents;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public String getCategory_image() {
		return category_image;
	}
	public void setCategory_image(String category_image) {
		this.category_image = category_image;
	}
	
	
	
	
	
	
	public List<LatestEvents> getLatestEvents() {
		return latestEvents;
	}
	public void setLatestEvents(List<LatestEvents> latestEvents) {
		this.latestEvents = latestEvents;
	}
	public List<TrendingEvents> getTrendingEvents() {
		return trendingEvents;
	}
	public void setTrendingEvents(List<TrendingEvents> trendingEvents) {
		this.trendingEvents = trendingEvents;
	}
	public Category1(String category_name, String category_image) {
		this.category_name = category_name;
		this.category_image = category_image;
	}
	public Category1() {
		
		// TODO Auto-generated constructor stub
	}
	
}
