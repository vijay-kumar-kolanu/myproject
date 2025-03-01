package Conditional_Statements;

import java.util.Scanner;

public class Vowel_or_Consonent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch=sc.next().charAt(0);
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u') {
			System.out.println(ch+" is Vowel");
		}
		else {
			System.out.println(ch+"  is consonent");
		}
	}
	

}
