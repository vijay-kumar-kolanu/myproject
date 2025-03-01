package Methhods;

public class with_fA_without_Returntype {
//	public static void main(String[] args) {
//		System.out.println("ms");
//		sum(99,1);
//		System.out.println("me");
//	}
//	public static void sum(int a ,int b) {
//		System.out.println("sum started");
//		int sum=a+b;
//		System.out.println("the sumation of two numbers "+sum);
//		System.out.println("sum ended");
//	}

	
	
	
	
	public static void count(int a) {

		int count =0;
		while(a!=0) {
			a=a/10;
			
			count++;
		}
		System.out.println("the numberr of Digits in a given number "+count);
		
	}
	
	public static void main(String[] args) {
		System.out.println("main started");
		count(8);
		System.out.println("main ended");
	}
}
