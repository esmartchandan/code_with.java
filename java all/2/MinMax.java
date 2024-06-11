import java.util.Scanner;

class MinMax{
	public static void main(String args[]){
		int a, i, min, max, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of numbers: ");
		n = sc.nextInt();
		System.out.print("Enter the numbers: ");
		a = sc.nextInt();
		min = a;
		max = a;
		for(i = 1; i < n; i++){
			a = sc.nextInt();
			if(a<min){
				min = a;
			}
			if(a>max){
				max = a;
			}
			if(i == n - 1) sc.close();
		}
		System.out.println("The minimum is " + min);
		System.out.print("The maximum is " + max+"\n");
	}
}