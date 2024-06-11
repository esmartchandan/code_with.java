import java.util.Scanner;

class EvenOdd{
	public static void main(String args[]){
		double a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		a = sc.nextDouble();
		sc.close();
		if(a % 2 == 0){
			System.out.println("This is an even number");
		} else {
			System.out.println("This is an odd number");
		}
	}
}