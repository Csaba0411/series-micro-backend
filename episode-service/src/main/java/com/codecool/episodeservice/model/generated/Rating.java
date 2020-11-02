package com.codecool.episodeservice.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rating{

	@JsonProperty("average")
	private double average;

	public double getAverage(){
		return average;
	}
}