package june10;

public class SortingDemo1 {
	public static void main(String a[]) {
		int numArray[] = new int[5];
		numArray[0] = 1;
		numArray[1] = 5;
		numArray[2] = 2;
		numArray[3] = 4;
		numArray[4] = 3;
	
		
		int sortedArray[] = new int[5];
		
		for(int i = 0; i < 5; i++) {			
			int min = 10000;
			for(int num : numArray) {
				if(num < min) {
					if(i == 0) {						
						min = num;
					}else {
						if( num > sortedArray[i-1] ) {
							min = num;
						}
					}
				}
			}
			sortedArray[i] = min;
			min = 10000;
		}
		
		System.out.print("numarray: ");
		for(int num : numArray) {
			System.out.print(num+"\t");
		}
		System.out.println();
		
		System.out.print("sortedarray: ");
		for(int num : sortedArray) {
			System.out.print(num+"\t");
		}
		System.out.println();
		
	}
}
