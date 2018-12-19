package basic1;

public class FenJieZhiYinShu2 {
	
	static int index =0;
	
	public static void main(String[] args)
	{
		int n = 13;
		Fenjie(n);
		n = 2;
		Fenjie(n);
		n = 100;
		Fenjie(n);
		n = 66;
		Fenjie(n);
		n = 90;
		Fenjie(n);
	}
	
	public static void Fenjie(int n)
	{
//		int finalresult;
		System.out.print(n + "=");
//		for (int i = 2; i < n+1; i++) {
//			while (n % i == 0 && n!=i) {
//				n = n/i;
//				System.out.print(i + "*");
//				break;
//			}
//			if (n==i) {
//				System.out.println(i);
//				break;
//			}
//		}
		FenjieDetail(n);
		System.out.println(1);
	}
	
	public static void FenjieDetail(int m)
	{
		for (int i = 2; i < m+1; i++) {
			if (m%i == 0) {
				m = m/i;
				System.out.print(i + "*");
				FenjieDetail(m);
				break;
			}
		}
//		return m;
	}

}
