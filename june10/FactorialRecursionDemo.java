package june10;

import java.util.Scanner;

import javax.xml.parsers.FactoryConfigurationError;

public class FactorialRecursionDemo {
	
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		System.out.println("Factorial of "+number+" is "+factorialOf(number));
	}
	
	static long factorialOf(long number){
		long factorial = -1;
		if(number <= 1) {			
			factorial = 1;
		}
		else {
			factorial = number * factorialOf(number-1);			
		}
		
		return factorial;
	}

}
