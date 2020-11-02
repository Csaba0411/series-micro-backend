package com.codecool.seriesservice.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Embedded{

	@JsonProperty("cast")
	private List<CastItem> cast;

	@JsonProperty("episodes")
	private List<EpisodesItem> episodes;

	public List<CastItem> getCast(){
		return cast;
	}

	public List<EpisodesItem> getEpisodes(){
		return episodes;
	}
}