package com.mouritech.hackathon.models;

import java.util.ArrayList;
import java.util.List;

public class DashBoard {
	private List<Contributers> trending_contributers = new ArrayList<>();
	private List<Topics> trending_topics = new ArrayList<>();
	private List<Articles> trending_articles = new ArrayList<>();

	public List<Contributers> getTrending_contributers() {
		return trending_contributers;
	}
	public List<Topics> getTrending_topics() {
		return trending_topics;
	}
	
	public List<Articles> getTrending_articles() {
		return trending_articles;
	}
	public void setTrending_articles(List<Articles> trending_articles) {
		this.trending_articles = trending_articles;
	}
	
	public void setTrending_contributers(List<Contributers> trending_contributers) {
		this.trending_contributers = trending_contributers;
	}
	public void setTrending_topics(List<Topics> trending_topics) {
		this.trending_topics = trending_topics;
	}
	
}


