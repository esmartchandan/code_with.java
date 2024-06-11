abstract  class Shape{
    abstract  double calculateArea();
}

class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    double calculateArea(){
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    double calculateArea(){
        return length * width;
    }
}

class CircleRect{
    public static void main(String args[]) {
        Circle c = new Circle(5);
        double area = c.calculateArea();
        System.out.println("\nThe area of the circle is "+String.format("%.2f", area));

        Rectangle r = new Rectangle(5, 3);
        area = r.calculateArea();
        System.out.println("\nThe area of the rectangle is "+String.format("%.2f", area));
    }
}