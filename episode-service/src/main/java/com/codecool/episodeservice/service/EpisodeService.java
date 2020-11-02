package com.codecool.episodeservice.service;

import com.codecool.episodeservice.model.generated.EpisodesItem;
import com.codecool.episodeservice.model.generated.Series;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EpisodeService {

    public List<EpisodesItem> getSeriesEpisodesById(String id) {
        RestTemplate template = new RestTemplate();
        ResponseEntity<Series> seriesResponseEntity = template.exchange("http://api.tvmaze.com/shows/" + id + "?embed[]=episodes", HttpMethod.GET, null, Series.class);
        return seriesResponseEntity.getBody()
                .getEmbedded()
                .getEpisodes();

    }


}
