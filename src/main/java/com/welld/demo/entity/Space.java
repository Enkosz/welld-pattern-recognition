package com.welld.demo.entity;

import java.util.*;

public class Space {
    private final Set<Point> points;
    private final Map<Line, Set<Point>> lines;

    public Space() {
        this.points = new HashSet<>();
        this.lines = new HashMap<>();
    }

    public void addPoint(Point point) {
        this.points.add(point);
    }

    public Set<Point> getPoints() {
        return points;
    }

    public Map<Line, Set<Point>> getLines() {
        return this.lines;
    }

    public boolean containsPoint(Point point) {
        return this.points.contains(point);
    }

    public void addPointsToLine(Line line, List<Point> points) {
        // If the line is already computed then the point is added to it
        // In this case points contains a single point instance
        if (this.lines.containsKey(line))
            this.lines.get(line).addAll(points);
        else
            // Otherwise, we save the new calculated line between 2 points
            this.lines.put(line, new HashSet<>(points));
    }

    public void clearSpace() {
        this.lines.clear();
        this.points.clear();
    }
}
