package basic3;

public class PeachMonkey {

	public static void main(String[] args) {
		
		System.out.println("There are " + fun(0) + " peaches on the beach.");
	}

	private static int fun(int i)
	{
		if (5 == i)
			return 1;
		else {
			return fun(i+1)*5+1;
		}
	}
	
}
