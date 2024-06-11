import java.util.Scanner;

class SumAverage{
	public static void main(String args[]){
		int a, i, sum= 0, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of numbers: ");
		n = sc.nextInt();
		System.out.print("Enter the numbers: ");
		for(i = 1; i <= n; i++){
			a = sc.nextInt();
			if(i == n) sc.close();
			sum += a;
		}
		System.out.println("The sum is " + sum);
		System.out.print("The avg is " + (float)sum/n);
	}
}