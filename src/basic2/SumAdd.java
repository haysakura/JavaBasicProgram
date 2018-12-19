package basic2;

public class SumAdd {
	
	public static void main(String[] args)
	{
		int n = 20;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += multiple(i);
		}
		System.out.println("The result is: " + sum);
	}
	
	public static int multiple(int n)
	{
		int multiple_result = 1;
		for (int i = 1; i <= n; i++) {
			multiple_result *= i;
		}
		return multiple_result;
	}

}
