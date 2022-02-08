package com.welld.demo.dto;

import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.NotNull;

public class CreatePointDto {

    @NotNull(message = "must be a valid number")
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Double x;

    @NotNull(message = "must be a valid number")
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Double y;

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
