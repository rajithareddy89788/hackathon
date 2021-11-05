package com.mouritech.hackathon.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="topics")
public class Topics {
	@JsonIgnore
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	
	private String topic_image;
	private String topic_name;
	
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTopic_image() {
		return topic_image;
	}
	public void setTopic_image(String topic_image) {
		this.topic_image = topic_image;
	}
	public String getTopic_name() {
		return topic_name;
	}
	public void setTopic_name(String topic_name) {
		this.topic_name = topic_name;
	}
	public Topics(String topic_image, String topic_name) {
		this.topic_image = topic_image;
		this.topic_name = topic_name;
	}
	public Topics() {
		
	}

}


