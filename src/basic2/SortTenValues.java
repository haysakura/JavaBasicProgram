package basic2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortTenValues {
	
	public static void main(String[] args)
	{
		int[] list = {55, 8, 9, 2, 56, 23, 45, 8, 9, 10};
		sortArray(list);
		
		for (int i = 0; i < list.length; i++) {
			System.out.println("The " + i + "th value is: " + list[i]);
		}
		
				
	}
	
	private static void sortArray(int[] li)
	{
		for (int i = 0; i < li.length-1; i++) 
			for (int j = 0; j < li.length-1; j++) {
				if (li[j] > li[j+1]) {
					li[j+1] = li[j+1] + li[j];
					li[j] = li[j+1] - li[j];
					li[j+1] = li[j+1] -li[j];
				}
			}
		
	}

}
