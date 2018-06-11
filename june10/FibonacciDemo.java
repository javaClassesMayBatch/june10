package june10;

import java.util.Scanner;

public class FibonacciDemo {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		System.out.println("Factorial of "+number+" is "+finonacciOf(number));
	}
	
	static long finonacciOf(long number){
		long fibonacci = -1;
		if(number <= 2) {			
			fibonacci = 1;
		}
		else {
			fibonacci = finonacciOf(number-1) + finonacciOf(number-2);			
		}
		
		return fibonacci;
	}
}

//1	2	3	4	5	6	7	8	9	10
//1	1	2	3	5	8	13	21	34	55
