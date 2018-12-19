package basic1;

import java.util.Iterator;
import java.util.Scanner;

public class CountCharacter {

	public static void main(String[] args) {
		System.out.println("Please input the String:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		count(str);

	}

	public static void count(String scanin)
	{
		String E1 = "[\u4e00-\u9fa5]";
		String E2 = "[a-zA-Z]";
		String E3 = "[0-9]";
		String E4 = "\\s";
		int countChinese = 0;
		int countLetter = 0;
		int countNumber = 0;
		int countSpace = 0;
		int countOther = 0;
		
		char[] charscan = scanin.toCharArray();
		String[] stringscan = new String[charscan.length];
		for (int i = 0; i < charscan.length; i++) {
			stringscan[i] = String.valueOf(charscan[i]);
		}
		
		for (String s : stringscan) {
			if (s.matches(E1)) {
				countChinese++;
			}
			else if (s.matches(E2))
			{
				countLetter++;
			}
			else if (s.matches(E3)) {
				countNumber++;
			}
			else if (s.matches(E4)) {
				countSpace++;
			}
			else {
				countOther++;
			}
		}
		
		System.out.println("The number of Chinese character is: " + countChinese);
		System.out.println("The number of Letter is: " + countLetter);
		System.out.println("The number of Number is: " + countNumber);
		System.out.println("The number of space is: " + countSpace);	
		System.out.println("The number of other is: " + countOther);
	}
	
}
