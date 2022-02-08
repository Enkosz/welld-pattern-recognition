package com.welld.demo.service;

import com.welld.demo.entity.Point;

import java.util.List;
import java.util.Set;

public interface SpaceService {

    Point addPoint(double x, double y);

    void clearSpace();

    List<Set<Point>> getLinesWithPoints(int n);

    Set<Point> getPoints();
}
