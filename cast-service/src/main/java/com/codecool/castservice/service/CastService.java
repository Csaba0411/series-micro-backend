package com.codecool.castservice.service;

import com.codecool.castservice.generated.Series;
import com.codecool.castservice.generated.people.People;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CastService {

    public People getPeopleById(String id) {
        RestTemplate template = new RestTemplate();
        ResponseEntity<People> seriesResponseEntity = template.exchange("http://api.tvmaze.com/people/" + id, HttpMethod.GET, null, People.class);
        return seriesResponseEntity.getBody();
    }

    public Series getSeriesById(String id) {
        RestTemplate template = new RestTemplate();
        ResponseEntity<Series> seriesResponseEntity = template.exchange("http://api.tvmaze.com/shows/" + id + "?embed[]=cast", HttpMethod.GET, null, Series.class);
        return seriesResponseEntity.getBody();
    }

}
