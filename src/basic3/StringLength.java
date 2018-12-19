package basic3;

import java.util.Scanner;

public class StringLength {
	
	public static void main(String[] args)
	{
		System.out.println("Please input a String: ");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		
		char[] ch = st.toCharArray();
		String[] str = new String[ch.length];
		for (int i = 0; i < str.length; i++) {
			str[i] = String.valueOf(ch[i]);
		}
		System.out.println("The length of the String is:" + ch.length);
		
		
	}

}
