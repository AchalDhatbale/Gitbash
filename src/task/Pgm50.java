package task;

import java.util.Scanner;

public class Pgm50 {
	public static int factorial(int num) {
		if(num==0)
			return 1;
		else
			return (num*factorial(num-1));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		
		int fact=1;
		fact=factorial(num);
		System.out.println("Factorial of "+num+" is "+fact);
	}
}
