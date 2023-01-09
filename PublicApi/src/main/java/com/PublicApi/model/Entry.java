package com.PublicApi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Entry {

	@JsonProperty("API")
	private String api;
	
	
	@JsonProperty("Description")
	private String description;
	
	
	@JsonProperty("Auth")
	private String auth;
	
	
	@JsonProperty("Https")
	private String https;
	
	
	@JsonProperty("Cors")
	private String cors;
	
	
	@JsonProperty("Category")
	private String category;
	
	
	
}
