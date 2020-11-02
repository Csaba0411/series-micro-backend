package com.codecool.castservice.controller;

import com.codecool.castservice.generated.CastItem;
import com.codecool.castservice.service.CastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CastController {

    @Autowired
    CastService castService;

    @GetMapping("/{id}/staff")
    public List<CastItem> getStaffbyId(@PathVariable("id") String id) {
        return castService.getSeriesById(id).getEmbedded().getCast();
    }

}
