import java.util.Scanner;

class Factorial{
	public static void main(String args[]){
		int a, i;
		long fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		a = sc.nextInt();
		sc.close();
		for(i = 1; i <= a; i++){
			fact = fact * i;
		}
		System.out.println("The ans is " + fact);
	}
}