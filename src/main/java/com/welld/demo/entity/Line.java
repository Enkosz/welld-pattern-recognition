package com.welld.demo.entity;

import java.util.Objects;

public class Line {
    private double slope;
    private double intercept;

    public Line(Point start, Point end) {
        slope = 0;
        intercept = 0;

        // If y1 = y2 then we simply say m = 0 since we have a horizontal line
        if (start.getY() == end.getY()) {
            intercept = start.getY();
        } else if (start.getX() == end.getX()) {
            // The slope should not be equal to x, but we can use it to represent x = k
            slope = start.getX();
        } else {
            slope = (start.getY() - end.getY()) / (start.getX() - end.getX());
            intercept = start.getY() - slope * start.getX();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        if (Double.compare(line.slope, slope) != 0) return false;
        return Double.compare(line.intercept, intercept) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(slope, intercept);
    }

    @Override
    public String toString() {
        return "y = " + slope + "x " + intercept;
    }
}
