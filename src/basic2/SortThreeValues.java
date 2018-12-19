package basic2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortThreeValues {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input three values:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int q = sc.nextInt();
		int m = sc.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(x);
		list.add(y);
		list.add(z);
		list.add(q);
		list.add(m);
		
		sortArray(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("The " + i + "th value is: " + list.get(i));
		}
		
				
	}
	
	private static void sortArray(List<Integer> li)
	{
		for (int i = 0; i < li.size()-1; i++) 
			for (int j = 0; j < li.size()-1; j++) {
				if (li.get(j) > li.get(j+1)) {
					li.set(j+1, li.get(j) + li.get(j+1));
					li.set(j, li.get(j+1) - li.get(j));
					li.set(j+1, li.get(j+1) - li.get(j));					
				}
			}
		
	}

}
