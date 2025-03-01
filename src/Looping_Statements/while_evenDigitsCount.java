package Looping_Statements;

public class while_evenDigitsCount {
public static void main(String[] args) {
	int num=12345678;
	
	int count=0;
	while(num!=0) {
		int rem=num%10;
		if(rem%2==0) {
			count++;
		}
	
		num=num/10;
	}
	System.out.println(count);
}
}
