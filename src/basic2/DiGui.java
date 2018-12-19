package basic2;

public class DiGui {
	
	public static void main(String[] args)
	{
		int n = 5;
		System.out.println("The result of 5! is: " + Digui(5));
	}
	
	public static int Digui(int n)
	{
		if (n == 1) {
			return 1;
		}
		else {
			return Digui(n-1)*n;
		}
	}
	
}
