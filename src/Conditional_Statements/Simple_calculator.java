package Conditional_Statements;

import java.util.Scanner;

public class Simple_calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("CHOOSE BELOW OPTIONS\n1.Addiotion\n2.Subtraction\n3.MUltiplication\n4.Division");
		int num=sc.nextInt();
		System.out.println("Enter the first vale");
		int a=sc.nextInt();
		System.out.println("Enter the Second value");
		int b=sc.nextInt();
		switch(num) {
		case 1:System.out.println("The Summation of Two Number "+(a+b));
		break;
		case 2:System.out.println("The Subtraction of two Numbers "+(a-b));
		break;
		case 3:System.out.println("The Multiplication of Two Numbers "+(a*b));
		break;
		case 4:System.out.println("The division of Two Numbers  "+a/b);
		break;
		default:System.out.println("Choose corect ❌");
		
		}
		
	}
}
