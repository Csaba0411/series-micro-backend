package com.codecool.seriesservice.service;

import com.codecool.seriesservice.model.generated.CastItem;
import com.codecool.seriesservice.model.generated.EpisodesItem;
import com.codecool.seriesservice.model.generated.Series;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SeriesApiService {

    @Autowired
    RemoteURLReader remoteURLReader;

    @Autowired
    private RestTemplate restTemplate;


    public Series[] getSeries() {
        RestTemplate template = new RestTemplate();
        ResponseEntity<Series[]> seriesResponseEntity =
                template.getForEntity("http://api.tvmaze.com/shows", Series[].class);
        return seriesResponseEntity.getBody();
    }


    public Series getSeriesById(String id) {
        RestTemplate template = new RestTemplate();
        ResponseEntity<Series> seriesResponseEntity = template.exchange("http://api.tvmaze.com/shows/" + id + "?embed[]=episodes&embed[]=cast", HttpMethod.GET, null, Series.class);
        return seriesResponseEntity.getBody();
    }

    public EpisodesItem[] getEpisodesById(String id) {
        RestTemplate template = new RestTemplate();
        return restTemplate.getForEntity("http://episode-service/episodes/" + id, EpisodesItem[].class).getBody();
    }

    public CastItem[] getCastById(String id) {
        RestTemplate template = new RestTemplate();
        return restTemplate.getForEntity("http://cast-service/" + id + "/staff", CastItem[].class).getBody();
    }

}