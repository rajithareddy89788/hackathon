package com.mouritech.hackathon.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="contributer")
	public class Contributers {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer id;
		private String image_url;
		private String name;
		private String unread_articles;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getImage_url() {
			return image_url;
		}
		public void setImage_url(String image_url) {
			this.image_url = image_url;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUnread_articles() {
			return unread_articles;
		}
		public void setUnread_articles(String unread_articles) {
			this.unread_articles = unread_articles;
		}
		public Contributers(String image_url, String name, String unread_articles) {
			this.image_url = image_url;
			this.name = name;
			this.unread_articles = unread_articles;
		}
		public Contributers() {
			
		}

	}

