package basic1;

public class Daffodils {

	public static void main(String[] args) {
		
		int min = 100;
		int max = 999;
		
		for (int i = min; i <= max; i++) {
			if (isDaffodils(i)) {
				System.out.println(i + " is a daffodils!");
			}
		}

	}
	
	public static Boolean isDaffodils(int m)
	{
		Boolean flag = false;
		int single = m % 10;
		int tenth = (m / 10) % 10;
		int hundred = m / 100;
		
		if ((single*single*single + tenth*tenth*tenth + hundred*hundred*hundred) == m) {
			flag = true;
		}
		
		return flag;
	}

}
