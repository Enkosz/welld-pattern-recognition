package com.welld.demo.service;

import com.welld.demo.entity.Point;

import java.util.List;
import java.util.Set;

public interface SpaceService {

    /**
     * Given a point coordinates a new point is created and added to the space
     * Foreach point in the space a line is calculated between the new point and the iterated one
     * If the line is already in the space it means that the point is on that line
     * Otherwise a new line is found and added to the space
     * This algorithm runs on O(n) by updating the lines on each insert, hashing is the core idea behind it
     * @param x
     * @param y
     * @return
     */
    Point addPoint(double x, double y);

    /**
     * Removes all the points and line saved on the space
     */
    void clearSpace();

    /**
     * Since we used HashMaps for saving lines and since we updated them on each point insert retrieving the lines with
     * at least n points is easy, we just need to look for all the lines that has at least n points
     * @param n
     * @return
     */
    List<Set<Point>> getLinesWithPoints(int n);

    /**
     * Retrieve all the points in a given space
     * @return
     */
    Set<Point> getPoints();
}
