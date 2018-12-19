package basic1;

public class Recursion {

	public static void main(String[] args) {
		int n = 10;
		System.out.println("The number of the rabbits of the " + n + "th month is:" + fun(n));
		
		n = 20;
		System.out.println("The number of the rabbits of the " + n + "th month is:" + fun(n));
		
		n = 30;
		System.out.println("The number of the rabbits of the " + n + "th month is:" + fun(n));
	}

	public static int fun(int n)
	{
		if (n == 1 || n==2)
			return 1;
		else
			return fun(n-1)+fun(n-2);
	}
	
}
