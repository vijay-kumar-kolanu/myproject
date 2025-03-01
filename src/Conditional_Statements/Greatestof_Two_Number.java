package Conditional_Statements;

import java.util.Scanner;

public class Greatestof_Two_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the FIrst value");
		int a=sc.nextInt();
		System.out.println("Enter the Second Value");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println(a+" value is Greatest Number");
		}
		else {
			System.out.println(b+" value is Greatest");
		}
	}

}
