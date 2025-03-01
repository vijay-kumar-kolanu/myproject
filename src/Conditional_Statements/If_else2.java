package Conditional_Statements;

import java.util.Scanner;

public class If_else2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the age");
	int age=sc.nextInt();
	if (age>=18) {
		System.out.println("the personn is Eligiblle for Voting");
	}
	else {
		System.out.println("Person is not Eligible For Voting");
	}
	
}
}
