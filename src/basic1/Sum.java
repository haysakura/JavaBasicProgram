package basic1;

public class Sum {
	
	public static void main(String[] args)
	{
		int[][] a = {{1}, {11}, {111}, {1111}, {11111}};
		a = new int[][]{{5}, {55}, {555}, {5555}, {55555}};
		int num =0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) {
				num = num + a[i][j];
				System.out.println(a[i][j]);
			}
		}
		System.out.println("The sum is: " + num);
	}

}
