package june10;

import java.util.Scanner;

public class NormalSearch {
	public static void main(String a[]) {
		int numArray[] = new int[5];
		numArray[0] = 1;
		numArray[1] = 5;
		numArray[2] = 4;
		numArray[3] = 3;
		numArray[4] = 2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to search in array");
		int num = sc.nextInt();
		
		boolean hasNum = false;
		for(int number: numArray) {
			if(num == number) {
				hasNum = true;
				break;
			}
		}
		
		if(hasNum) {
			System.out.println("Number Found.");
		}else {
			System.out.println("Number not found");
		}
	}
}
