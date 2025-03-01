package Conditional_Statements;

import java.util.Scanner;

public class Smallest_of_Three_Numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st value");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd Value");
		int b=sc.nextInt();
		System.out.println("Enter the 3rd value");
		int c=sc.nextInt();
		if(a<b&& a<c) {
			System.out.println(a+" is Smallest value");
		}
		else if(b<a&& c<a) {
			System.out.println(b+" is Smallest Value");
			
		}else {
			System.out.println(c+" is  Smallest  value");
		}
		
	}

}
