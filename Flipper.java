package flipper;

import java.util.Scanner;

public class Flipper {

	public static void main(String[] args) {

		
		Scanner ng = new Scanner(System.in); 
		System.out.println("Please enter a number to reverse");
		int f= ng.nextInt(); 
		
		int reverse = 0;
				
		int remainder;
		
		while(f!=0){
			remainder=f%10;
			reverse=reverse*10+remainder;
			f=f/10;
		
		} 
		
		System.out.println(reverse);
	}

}
