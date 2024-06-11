interface GeometricObject {
    double getArea();
    double getPerimeter();
}

class Circle implements GeometricObject{
    double radios;
    Circle(double radios){
        this.radios = radios;
    }
    public double getArea(){
        double area = Math.PI * radios * radios;
        return area;
    }
    public double getPerimeter(){
        double perimeter = Math.PI * 2 * radios;
        return perimeter;
    }
}

class Rectangle implements GeometricObject{
    double height, width;
    Rectangle(double height, double width){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return height * width;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }
}

class Geometry{
    public static void main(String[] args) {
        Circle c = new Circle(5);
        double area = c.getArea();
        double perimeter = c.getPerimeter();
        System.out.println("\nThe area of the circle is "+String.format("%.2f", area));
        System.out.println("The perimeter of the circle is "+String.format("%.2f", perimeter));
        Rectangle r = new Rectangle(5, 6);
        area = r.getArea();
        perimeter = r.getPerimeter();
        System.out.println("\nThe area of the rectangle is "+String.format("%.2f", area));
        System.out.println("The perimeter of the rectangle is "+String.format("%.2f", perimeter)+"\n");

    }
}