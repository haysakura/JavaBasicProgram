package basic2;

import java.util.Scanner;

public class DiGuiAge {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please input a five digit number: ");
			int n = sc.nextInt();
			System.out.println("Number " + n + " is HuiWen Number? " + isHuiWen(n));
		}
	}
	
	public static Boolean isHuiWen(int n)
	{
		Boolean flag = false;
		int unit;
		int decade;
		int hundred;
		int thousand;
		int ten_thousand;
		
		ten_thousand = n/10000;
		thousand = (n-ten_thousand*10000)/1000;
		hundred = (n-ten_thousand*10000-thousand*1000)/100;
		decade = (n-ten_thousand*10000-thousand*1000-hundred*100)/10;
		unit = n-ten_thousand*10000-thousand*1000-hundred*100-decade*10;
		
		if ((ten_thousand == unit) && (thousand == decade)) {
			flag = true;
		}
		
		return flag;
	}

}
