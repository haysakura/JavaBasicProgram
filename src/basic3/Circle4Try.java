package basic3;

import java.util.Scanner;

public class Circle4Try {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the number of people in the circle: ");
		int n = sc.nextInt();
		
		int Numpeople = n; // all together people in the circle
		int index = 0;  // the index of the counting people
		int NumCount = 0;  // the 1-4 circular counting
		int countLimit = 4; // it's 1-countLimit counting, countLimit is 4
		
		boolean[] isIn = new boolean[n];		
		for (int i = 0; i < isIn.length; i++) {
			isIn[i] = true;
		}		
		
		while (Numpeople > 1) {
			if (isIn[index]) {
				NumCount++;
				if (NumCount == countLimit) {
					NumCount = 0;
					isIn[index] = false;
					Numpeople--;
				}
			}
			index++;
			if (index == n) {
				index = 0;
			}
		}
		
		for (int i = 0; i < isIn.length; i++) {
			if (isIn[i]) {
				System.out.println("The index of the people last staying is: " + (i+1));
			}
		}
		
	}

}
