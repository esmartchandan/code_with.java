import java.util.Scanner;

class Circle{
	public static void main(String args[]){
		double area, perimeter, radios;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radious: ");
		radios = sc.nextDouble();
		sc.close();
		area = Math.PI * radios * radios;
		perimeter = 2 * Math.PI * radios;
		System.out.println("\nArea = " + String.format("%.2f",area) + "\nPerimeter = " + String.format("%.2f",perimeter)+"\n");
	}
}