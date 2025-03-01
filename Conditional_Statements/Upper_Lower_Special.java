package Conditional_Statements;

import java.util.Scanner;

public class Upper_Lower_Special {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Character");
	char ch=sc.next().charAt(0);
	if(ch>65&&ch<=90) {
		System.out.println("Uppercase character");
	}else if(ch>=97&&ch<=122) {
		System.out.println("Lower Case character");
	}else if(ch>='0'&&ch<='9') {
		System.out.println("it is a number");
	}
	else if(ch>=1&&ch<=47||ch>=91&&ch<=96||ch>=58&&ch<=64) {
		System.out.println("speaical character");
	}
}
}
