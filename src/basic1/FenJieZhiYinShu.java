package basic1;

import java.awt.List;
import java.util.ArrayList;

public class FenJieZhiYinShu {
		
	static java.util.List<Integer> zhiYinShuArray = new ArrayList<Integer>();
	
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
		System.out.print(n + "=");
		FenjieDetail(n);
		for (int i = 0; i < zhiYinShuArray.size()-1; i++) {
			System.out.print(zhiYinShuArray.get(i) + "*");;
		}
		System.out.println(zhiYinShuArray.get(zhiYinShuArray.size()-1));
		
		zhiYinShuArray.clear();
	}
	
	public static void FenjieDetail(int m)
	{
		for (int i = 2; i < m+1; i++) {
			if (m%i == 0) {
				m = m/i;
				zhiYinShuArray.add(i);
				FenjieDetail(m);
				break;
			}
		}
	}

}
