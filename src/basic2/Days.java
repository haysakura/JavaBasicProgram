package basic2;

import java.util.Scanner;

public class Days {
	
	public static void main(String[] args)
	{
		int y, m, d;
		int sum = 0;
		int feb = 28;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the year:");
		y = sc.nextInt();
		System.out.println("Please input the month:");
		m = sc.nextInt();
		System.out.println("Please input the day:");
		d = sc.nextInt();
		sc.close();
		
		if ((y%4 == 0 && y%100 != 0) || y%400 == 0) {
			feb = 29;
		}
		
		// as feb value will be modified in the previous line, so this int array must be defined here
		// after the previous line, or the value of feb will always be 28 no change.
		int[] days = new int[]{31, feb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// days array index from 0
		sum += d;
		if (m != 1) {
			for (int i = 0; i <= m-2; i++) {
				sum += days[i];
			}
		}
		
		System.out.println("yyyy-m-d is: " + y + "-" + m + "-" + d);
		System.out.println("The days are: " + sum);				
	}

}
