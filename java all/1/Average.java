import java.util.Scanner;

class Average{
	public static void main(String args[]){
		double average, a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		a = sc.nextDouble();
		System.out.print("Enter 2nd number: ");
		b = sc.nextDouble();
		System.out.print("Enter 3rd number: ");
		c = sc.nextDouble();
		average = (a + b + c) / 3.0;
		System.out.println("\nThe average is: " + average);
		sc.close();
	}
}