package basic1;

import java.util.Scanner;

public class SanMuYunSuan {

	public static void main(String[] args) {

		System.out.println("Please input the score:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String result = (n>=90)?"A":((n>=60)?"B":"C");
		System.out.println(result);
	}

}
