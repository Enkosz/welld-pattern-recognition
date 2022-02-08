package com.welld.demo.dto;

import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.NotNull;

public class CreatePointDto {

    @NotNull
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private double x;

    @NotNull
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
