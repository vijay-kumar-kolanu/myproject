package Conditional_Statements;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int res=num%2;
		switch(res) {
		case 0:System.out.println("even number");
		break;
		case 1: System.out.println("ODD Number");
		break;
		
		
		}
		
	}

}
