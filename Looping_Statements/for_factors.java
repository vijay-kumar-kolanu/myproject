package Looping_Statements;

public class for_factors {
	public static void main(String[] args) {
		int num=8;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}

}
