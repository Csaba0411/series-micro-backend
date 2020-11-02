package com.codecool.seriesservice.controller;

import com.codecool.seriesservice.model.generated.CastItem;
import com.codecool.seriesservice.model.generated.EpisodesItem;
import com.codecool.seriesservice.model.generated.Series;
import com.codecool.seriesservice.service.SeriesApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shows")
@CrossOrigin("*")
public class SeriesController {

    @Autowired
    private SeriesApiService seriesApiService;

    @GetMapping
    public Series[] getSeries() {
        return seriesApiService.getSeries();
    }

    @GetMapping("/{id}")
    public Series getSeriesById(@PathVariable("id") String id) {
        return seriesApiService.getSeriesById(id);
    }

    @GetMapping("/{id}/episodes")
    public EpisodesItem[] getSeriesEpisodesById(@PathVariable("id") String id) {
        return seriesApiService.getEpisodesById(id);
    }

    @GetMapping("/{id}/staff")
    public CastItem[] getSeriesStaffById(@PathVariable("id") String id) {
        return seriesApiService.getCastById(id);
    }

}