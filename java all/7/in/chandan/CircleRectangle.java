package in.chandan;

import com.myapp.shapes.Circle;
import com.myapp.shapes.Rectangle;

public class CircleRectangle {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        double area = c.calculateArea();
        double perimeter = c.calculatePerimeter();
        System.out.println("\nThe area is " + String.format("%.2f", area));
        System.out.println("The perimeter is " + String.format("%.2f", perimeter));
        Rectangle r = new Rectangle(5.6, 7.3);
        area = r.calculateArea();
        perimeter = r.calculatePerimeter();
        System.out.println("\nThe area is " + String.format("%.2f", area));
        System.out.println("The perimeter is " + String.format("%.2f", perimeter) + "\n");
    }
}
