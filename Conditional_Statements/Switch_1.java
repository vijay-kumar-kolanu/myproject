package Conditional_Statements;

import java.util.Scanner;

public class Switch_1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the character");
	char ch=sc.next().charAt(0);
	switch(ch) {
	case 'A':System.out.println("Apple");
	break;
	case 'B':System.out.println("Ball");
	break;
	
	case 'C':System.out.println("cat");
	break;
	
	case 'D':System.out.println("Dog");
	break;
	case 'E':System.out.println("Invalid Data");
	break;
	default :System.out.println("check data");
	break;
	
	}
	
	
}
}
