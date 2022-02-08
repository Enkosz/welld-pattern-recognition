package com.welld.demo.controller;

import com.welld.demo.entity.Point;
import com.welld.demo.service.SpaceService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping(path = "/space")
public class SpaceController {
    private final SpaceService spaceService;

    public SpaceController(SpaceService spaceService) {
        this.spaceService = spaceService;
    }

    @GetMapping()
    public Set<Point> getSpace() {
        return spaceService.getPoints();
    }

    @DeleteMapping
    public void deleteSpace() {
        spaceService.clearSpace();
    }
}
