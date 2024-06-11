import java.util.Scanner;

class Armstrong{
	public static void main(String args[]){
		int a, temp, digit, num=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		a = sc.nextInt();
		temp = a;

		int len = String.valueOf(a).length(); //calculate the length of the number

		while(temp !=0){
			digit = temp % 10;
			num = num + (int) Math.pow(digit, len);
			temp = temp/10;
		}
		if(num == a){
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not a Armstrong number");
		}
		sc.close();
	}
}