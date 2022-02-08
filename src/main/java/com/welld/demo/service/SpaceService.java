package com.welld.demo.service;

import com.welld.demo.entity.Point;

import java.util.List;
import java.util.Set;

public interface SpaceService {

    void addPoint(double x, double y);

    List<Set<Point>> getLinesWithPoints(int n);
}
