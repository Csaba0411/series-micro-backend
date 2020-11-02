package com.codecool.castservice.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rating{

	@JsonProperty("average")
	private double average;

	public double getAverage(){
		return average;
	}
}