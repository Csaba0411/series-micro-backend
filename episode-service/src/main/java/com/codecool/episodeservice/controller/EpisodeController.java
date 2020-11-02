package com.codecool.episodeservice.controller;


import com.codecool.episodeservice.model.generated.EpisodesItem;
import com.codecool.episodeservice.service.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EpisodeController {

    @Autowired
    EpisodeService episodeService;

    @GetMapping("/episodes/{id}")
    public List<EpisodesItem> getSeriesEpisodesById(@PathVariable("id") String id) {
        return episodeService.getSeriesEpisodesById(id);
    }
}
