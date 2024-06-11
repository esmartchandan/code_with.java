//create a class with a method in java, and use an object of this class to call the method

import java.util.Scanner;

class Object{
	void welcome(String a){
		System.out.println("\nHello "+a+"\nWelcome to Core java lab\n");
	}
	public static void main(String args[]){
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		s = sc.nextLine();
		Object obj = new Object();
		obj.welcome(s);
		sc.close();
	}
}