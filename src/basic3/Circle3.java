package basic3;

import java.util.Scanner;

public class Circle3 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number of people in the circle: ");
		int n = sc.nextInt();
		sc.close();
		
		Boolean[] isIn= new Boolean[n];
		for (int i = 0; i < isIn.length; i++) {
			isIn[i] = true;
		}
		
		int inCount = n;  // all together n people in the circle
		int countNum = 0;  // the 1-3 countNum for each time counting
		int index = 0;  // the index of the index-th people in the circle
		
		while (inCount>1) {
			if (isIn[index]) {
				countNum++;
				if (countNum == 3) {
					countNum = 0;
					isIn[index] = false;
					inCount--;
				}
			}
			index++;
			if (index == n) {
				index = 0;
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (isIn[i]) {
				System.out.println("The last left one is: " + (i+1));
			}
		}
		
	}

}
