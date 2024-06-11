import java.util.Scanner;

class Calculator{
	public static void main(String args[]){
		int a, b, c = 0, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Remainder");
		System.out.print("Enter the operation: ");
		d = sc.nextInt();
		System.out.print("Enter first number: ");
		a = sc.nextInt();
		System.out.print("Enter second number: ");
		b = sc.nextInt();
		sc.close();
		if(d == 1){
			c = a + b;
		} else if(d == 2){
			c = a - b;
		} else if(d == 3){
			c = a * b;
		} else if(d == 4){
			c = a / b;
		} else if(d == 5){
			c = a % b;
		} else {
			System.out.println("Invalid");
		}
		System.out.println("\nThe ans is " + c + "\n");
	}
}