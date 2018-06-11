package june10;

import java.util.Scanner;

public class FactorialRecursionDemo2 {
	
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		System.out.println("Factorial of "+number+" is "+factorialOf(number));
	}
	
	static long factorialOf(long number){
		if(number <= 1) {			
			return 1;
		}
		else {
			return number * factorialOf(number-1);			
		}
	}

}
