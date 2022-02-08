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
    public Point addPoint(double x, double y) {
        Point newPoint = new Point(x, y);

        // Space contains only unique points
        if (space.containsPoint(newPoint))
            return newPoint;

        space.getPoints().forEach(point -> {
            Line line = new Line(point, newPoint);

            // If the line is new then it is added to the collection
            space.addPointsToLine(line, List.of(point, newPoint));
        });

        space.addPoint(newPoint);

        return newPoint;
    }

    @Override
    public void clearSpace() {
        this.space.clearSpace();
    }

    @Override
    public List<Set<Point>> getLinesWithPoints(int n) {
        return this.space.getLines()
                .values()
                .stream()
                .filter(points -> points.size() >= n)
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public Set<Point> getPoints() {
        return this.space.getPoints();
    }
}
