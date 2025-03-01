package Looping_Statements;

public class breakkeyword {
	public static void main(String[] args) {
		int num=1;
		while(num<=10) {
			System.out.println(num);
			if(num==4) {
				break;
			}
			num++;
		}
	}

}
