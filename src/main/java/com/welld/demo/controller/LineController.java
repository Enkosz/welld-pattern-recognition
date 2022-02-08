package com.welld.demo.controller;

import com.welld.demo.entity.Point;
import com.welld.demo.service.SpaceService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(path = "/lines")
public class LineController {
    private final SpaceService spaceService;

    public LineController(SpaceService spaceService) {
        this.spaceService = spaceService;
    }

    @GetMapping("/{n}")
    public List<Set<Point>> getLinesWithPoints(@PathVariable Integer n) {
        if (n < 1)
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "N must be a positive number");

        return this.spaceService.getLinesWithPoints(n);
    }
}
