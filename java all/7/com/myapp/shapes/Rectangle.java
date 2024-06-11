package com.myapp.shapes;

public class Rectangle {
    double height, width;
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    public double calculateArea(){
        return  height * width;
    }
    public double calculatePerimeter(){
        return 2 * (height + width);
    }
}
