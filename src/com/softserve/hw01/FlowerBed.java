package com.softserve.hw01;

import java.util.Scanner;

public class FlowerBed {
    public void calculateAreaAndPerimeter() {
        Scanner sc = new Scanner(System.in);
        int r;
        //double perimeter;
        //double square;
        //double pi = Math.PI;
        System.out.println("Write the radius");
        r = Integer.parseInt(sc.nextLine());
        System.out.println("Radius: " + r);

        //perimeter = 2 * pi * r;
        //square = pi * Math.pow(r, 2);
        //System.out.println("Perimeter = " + Precision.round(perimeter, 2));
            //System.out.println("Perimeter = " + Precision.round(calculatePerimeter(r), 2));
        //System.out.print("Square = " + Precision.round(square, 2));
            //System.out.print("Square = " + Precision.round(calculateArea(r), 2)); // alternative round

        System.out.print("Perimeter = ");
        System.out.format("%.2f",calculatePerimeter(r));
        System.out.print("\r\nArea = ");
        System.out.format("%.2f",calculateArea(r));
        sc.close();
    }

    private double calculatePerimeter(int radius) {
        return 2 * Math.PI * radius;
    }
    private double calculateArea(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
