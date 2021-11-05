package com.mouritech.hackathon.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "categories")
		
public class Category {
	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "categoryId")
	private Long categoryId;
	
	@Size(max = 20)
	@Column(name = "category")
	
	private String category;
	 
	 @OneToMany( cascade = {
		        CascadeType.ALL
		    })
	 @JoinColumn(name = "categoryId")
	  
		    private List < Items > items;
	 

	
	public Category()
	{
		
	}
	
	
	

	public Category(@Size(max = 20) String category) {
		this.category = category;
	}




	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}




	public List<Items> getItems() {
		return items;
	}




	public void setItems(List<Items> items) {
		this.items = items;
	}




	





	
}
