package com.welld.demo;

import com.welld.demo.entity.Point;
import com.welld.demo.service.SpaceService;
import com.welld.demo.service.SpaceServiceImpl;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SpaceService spaceService = new SpaceServiceImpl();

        System.out.println("Calculating points");

        for(int i = 0; i < 100; i++) {
            spaceService.addPoint(Math.floor(Math.random() * 2), Math.floor(Math.random() * 2));
        }

        List<Set<Point>> lines = spaceService.getLinesWithPoints(1);

        System.out.println("Printing lines");

        lines.forEach(line -> {
            System.out.println(line.toString());
        });
     }
}
