package basic2;

public class PrintStar {
	
	public static void main(String[] args)
	{
		int n = 4;
		Printstar(n);
	}
	
	public static void Printstar(int n)
	{
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < 2*n; j++) {
				if (j<=n-i)
					System.out.print(" ");
				if (j>n-i && j<n+i)
					System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i < n; i++) {
			System.out.print(" ");
			for (int j = 1; j < 2*n; j++) {
				if (j<i) {
					System.out.print(" ");
				}
				if (j>=i && j<2*n-i-1) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
