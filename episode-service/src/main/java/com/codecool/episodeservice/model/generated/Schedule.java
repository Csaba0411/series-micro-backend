package com.codecool.episodeservice.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Schedule{

	@JsonProperty("days")
	private List<String> days;

	@JsonProperty("time")
	private String time;

	public List<String> getDays(){
		return days;
	}

	public String getTime(){
		return time;
	}
}