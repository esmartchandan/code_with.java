package com.myapp.shapes;

public class Circle {
    double radios;
    public Circle(double radios){
        this.radios = radios;
    }
    public double calculateArea(){
        return Math.PI * radios * radios;
    }
    public double calculatePerimeter(){
        return 2 * Math.PI * radios;
    }
}
