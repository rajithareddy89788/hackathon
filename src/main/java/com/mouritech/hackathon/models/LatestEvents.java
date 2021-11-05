package com.mouritech.hackathon.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="latestevents")
public class LatestEvents {
	@JsonIgnore
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer lid;

	private String event_image;
	private String event_name;
	private String event_author;
	private String event_location;
	private String price;
	
	
	public String getEvent_image() {
		return event_image;
	}
	public void setEvent_image(String event_image) {
		this.event_image = event_image;
	}
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	public String getEvent_author() {
		return event_author;
	}
	public void setEvent_author(String event_author) {
		this.event_author = event_author;
	}
	public String getEvent_location() {
		return event_location;
	}
	public void setEvent_location(String event_location) {
		this.event_location = event_location;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
	public Integer getLid() {
		return lid;
	}
	public void setLid(Integer lid) {
		this.lid = lid;
	}
	public LatestEvents(String event_image, String event_name, String event_author, String event_location,
			String price) {
		this.event_image = event_image;
		this.event_name = event_name;
		this.event_author = event_author;
		this.event_location = event_location;
		this.price = price;
	}
	public LatestEvents() {
	
		// TODO Auto-generated constructor stub
	}
	
	

}
