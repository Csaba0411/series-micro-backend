package com.codecool.episodeservice.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Image{

	@JsonProperty("original")
	private String original;

	@JsonProperty("medium")
	private String medium;

	public String getOriginal(){
		return original;
	}

	public String getMedium(){
		return medium;
	}
}