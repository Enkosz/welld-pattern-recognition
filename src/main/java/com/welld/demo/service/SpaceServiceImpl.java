package com.welld.demo.service;

import com.welld.demo.entity.Line;
import com.welld.demo.entity.Point;
import com.welld.demo.entity.Space;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class SpaceServiceImpl implements SpaceService {
    private final Space space;

    public SpaceServiceImpl() {
        this.space = new Space();
    }

    @Override
    public void addPoint(double x, double y) {
        Point newPoint = new Point(x, y);

        if (space.containsPoint(newPoint))
            return;

        System.out.println("Adding point: " + newPoint);

        Set<Point> points = space.getPoints();

        points.forEach(point -> {
            Line line = new Line(point, newPoint);

            space.addPointsToLine(line, List.of(point, newPoint));
        });

        space.addPoint(newPoint);
    }

    @Override
    public List<Set<Point>> getLinesWithPoints(int n) {
        return this.space.getLines()
                .values()
                .stream()
                .filter(points -> points.size() >= n)
                .collect(Collectors.toUnmodifiableList());
    }
}
