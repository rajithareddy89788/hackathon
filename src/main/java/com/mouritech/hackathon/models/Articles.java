package com.mouritech.hackathon.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="articles")
public class Articles {
	@JsonIgnore
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Integer id;
	private String title;
	private Date upload_time;
	private Integer read_time;
	private String tag;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Date getUpload_time() {
		return upload_time;
	}
	public void setUpload_time(Date upload_time) {
		this.upload_time = upload_time;
	}
	public Integer getRead_time() {
		return read_time;
	}
	public void setRead_time(Integer read_time) {
		this.read_time = read_time;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public Articles( String title, Date upload_time, Integer read_time, String tag) {
	
		this.title = title;
		this.upload_time = upload_time;
		this.read_time = read_time;
		this.tag = tag;
	}
	public Articles() {
		
	}
}

