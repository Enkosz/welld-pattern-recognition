package com.welld.demo.controller;

import com.welld.demo.dto.CreatePointDto;
import com.welld.demo.service.SpaceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/point")
public class PointController {
    private final SpaceService spaceService;

    public PointController(SpaceService spaceService) {
        this.spaceService = spaceService;
    }

    @PostMapping()
    public void createPoint(@RequestBody() CreatePointDto createPointDto) {
        this.spaceService.addPoint(createPointDto.x, createPointDto.y);
    }
}
