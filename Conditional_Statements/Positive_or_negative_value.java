package Conditional_Statements;

import java.util.Scanner;

public class Positive_or_negative_value {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enteer the value");
		int num=sc.nextInt();
		if (num>0) {
			System.out.println(num+ " the number is Positive");
			if(num%2==0) {
				System.out.println(num+ "  Even number");
	
			}else {
				System.out.println(num+ " odd number");
			}
		}else {
			System.out.println(num+"  the number is negative");
		}
	
	}

}
