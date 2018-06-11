package june10;

import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String a[]) {
		int numArray[] = new int[15];
		numArray[0] = 1;
		numArray[1] = 5;
		numArray[2] = 14;
		numArray[3] = 31;
		numArray[4] = 42;
		numArray[5] = 51;
		numArray[6] = 65;
		numArray[7] = 74;
		numArray[8] = 93;
		numArray[9] = 112;
		numArray[10] = 122;
		numArray[11] = 153;
		numArray[12] = 194;
		numArray[13] = 231;
		numArray[14] = 412;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to search in array");
		int num = sc.nextInt();
		
		boolean hasNum = false;
		
		int minIndex = 0;
		int maxIndex = numArray.length-1;
		int searchIndex = (minIndex+maxIndex)/2;
		
		
		while(!hasNum) {
			if(numArray[searchIndex] == num) {
				hasNum = true;
			}else {
				if(numArray[searchIndex] < num) {
					minIndex = searchIndex ;
					searchIndex = (minIndex+maxIndex)/2;
				}else {
					maxIndex = searchIndex ;
					searchIndex = (minIndex+maxIndex)/2;
				}
			}
			if(minIndex >= maxIndex) {
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
