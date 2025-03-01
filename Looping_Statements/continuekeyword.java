package Looping_Statements;

public class continuekeyword {
public static void main(String[] args) {
	int num=10;
	for(int i=1;i<=num;i++) {
		
		if(i==5||i==7||i==10) {
			continue;
		}
		System.out.println(i);
	}
}
}
