package basic1;

public class Prime {
	
	public static void main(String[] args)
	{
		int min = 101;
		int max = 200;
		
		for (int i = min; i <= max; i++) {
			if (isPrime(i)) {
				System.out.println(i + " is a prime!");
			}
		}
		
	}
	
	public static Boolean isPrime(int n)
	{
		Boolean flag = false;
		if (n == 1)
		{
			return false;
		}
		for (int i = 2; i <= (int)Math.sqrt(n); i++) {
			if (n%i == 0) {
				flag = false;
				break;
			}
			if (i == (int)Math.sqrt(n)) {
				flag = true;
			}
		}
		return flag;
	}

}
