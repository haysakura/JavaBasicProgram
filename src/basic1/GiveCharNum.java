package basic1;

import java.util.Scanner;

public class GiveCharNum {
	
	public static void main(String[] args)
	{
		System.out.println("Please input the String:");
		Scanner sc = new Scanner(System.in);
		String hhh = sc.nextLine();
		int result = findNum(hhh);
		System.out.println("The output for " + hhh + " is: " + result);
	}

	private static int findNum(String  hh)
	{
		int result = 0;
		int length = hh.length();
		char[] hh_char = hh.toCharArray();
		
		
		// ab =27
		for (int i = 0; i < length; i++) 
		{
			
			System.out.println(hh_char[i]);
			result += (hh_char[i]-'a'+1)*Math.pow(26, length-i-1);
			System.out.println("result is: " + result);
		}
		
		return result;
	}
	
}
