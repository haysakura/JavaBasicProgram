package basic3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class FenShuSum {

	public static void main(String[] args) throws FileNotFoundException {

		InputStream in = new FileInputStream(new File("D:\\file.txt"));
		Scanner sc = new Scanner(in);		
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			
			double sum = 0.0;
			int start = 1;
			
			if (0 == n%2) {
				start = 2;
			}
			
			for (int i = start; i <= n; i +=2) {
				sum += 1.0/i;
			}
			
			System.out.println("The number of n is: " + n);
			System.out.println("The sum is: " + sum);
		}
		
	}
	
}
