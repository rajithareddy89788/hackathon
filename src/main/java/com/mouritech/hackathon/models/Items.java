package com.mouritech.hackathon.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "items")

public class Items {
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String  image_url;

	private String item_title;

	private String item_description;
	
	private int actual_price;
	
	private int discount_price;
	
//@JsonIgnore
	  //@ManyToOne(cascade =
		       // CascadeType.ALL)
	  // @JoinColumn(name = "categoryId")
	  
    //private Categories categories;
	public Items()
	{
		
	}

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public String getItem_title() {
		return item_title;
	}
	public void setItem_title(String item_title) {
		this.item_title = item_title;
	}
	public String getItem_description() {
		return item_description;
	}
	public void setItem_description(String item_description) {
		this.item_description = item_description;
	}
	public int getActual_price() {
		return actual_price;
	}
	public void setActual_price(int actual_price) {
		this.actual_price = actual_price;
	}
	public int getDiscount_price() {
		return discount_price;
	}
	public void setDiscount_price(int discount_price) {
		this.discount_price = discount_price;
	}
	
	
	
	

}
