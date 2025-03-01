package Conditional_Statements;

import java.util.Scanner;

public class compare_two_numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a=sc.nextInt();
		System.out.println("Enter the Second Number");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println(a+" is Greather than "+b);
			
		}
		else if(b>a){System.out.println(b+ " Is Greather than "+a);
			
		}else {
			System.out.println(a+" is Equals to "+b);
		}
	
	}
}
