package com.welld.demo.controller;

import com.welld.demo.dto.CreatePointDto;
import com.welld.demo.entity.Point;
import com.welld.demo.service.SpaceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/point")
public class PointController {
    private final SpaceService spaceService;

    public PointController(SpaceService spaceService) {
        this.spaceService = spaceService;
    }

    @PostMapping()
    public Point createPoint(@Valid @RequestBody() CreatePointDto createPointDto) {
        return this.spaceService.addPoint(createPointDto.getX(), createPointDto.getY());
    }
}
