package com.codecool.seriesservice.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rating{

	@JsonProperty("average")
	private double average;

	public double getAverage(){
		return average;
	}
}