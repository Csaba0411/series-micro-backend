package com.codecool.episodeservice.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Links{

	@JsonProperty("self")
	private Self self;

	public Self getSelf(){
		return self;
	}
}