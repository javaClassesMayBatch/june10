package june10;

public class BubbleSort {
	public static void main(String a[]) {
		int numArray[] = new int[5];
		numArray[0] = 1;
		numArray[1] = 5;
		numArray[2] = 4;
		numArray[3] = 3;
		numArray[4] = 2;
		System.out.print("numarray before sorting: ");
		for(int num : numArray) {
			System.out.print(num+"\t");
		}
		System.out.println();
		for(int i = 0; i < numArray.length-1; i++) {
			for(int j = 0; j < numArray.length - i - 1; j++) {
				if(numArray[j] > numArray[j+1]) {
					numArray[j] += numArray[j+1];
					numArray[j+1] = numArray[j]-numArray[j+1];
					numArray[j] = numArray[j]-numArray[j+1];
				}
			}
		}
		System.out.print("numarray after sorting: ");
		for(int num : numArray) {
			System.out.print(num+"\t");
		}
		System.out.println();
		
	}
	
	
	static void interchangeVlaues(int a, int b){
		a += b;
		b = a-b;
		a = a-b;
	}

}
