package Conditional_Statements;
import java.util.Scanner;
public class if_else {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	if(num%2==0) {
		System.out.println("Even number");
	}else {
		System.out.println("odd number");
	}
	
}
}
