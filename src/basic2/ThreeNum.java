package basic2;

public class ThreeNum {
	
	public static void main(String[] args)
	{
		int magicmin = 1;
		int magicmax = 4;
		int num = 0;
		int index = 1;
		for (int i = magicmin; i <= magicmax; i++)
			for (int j = magicmin; j <= magicmax; j++) {
				if (i == j) {
					continue;
				}
				for (int k = magicmin; k <= magicmax; k++) {
					if (k != i && k !=j) {
						num = i*100 + j*10 + k;
						System.out.println(index + ": The number is: " + num);
						index++;
					}
				}
				
			}
	}

}
