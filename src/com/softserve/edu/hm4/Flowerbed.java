package com.softserve.edu.hm4;

public class Flowerbed {
    private Integer radius;
    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    Flowerbed(Integer radius){
        setRadius(radius);
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public double getArea(){
        return Math.PI* Math.pow(radius,2);
    }
}
