package basic3;

public class StringSort {

	public static void main(String[] args) {
		
		String[] str = {"asb", "abs", "sba", "bsa"};
		
		for (int i = str.length-1; i >= 1; i--) {
			for (int j = 0; j <= i-1; j++) {
				if (str[j].compareTo(str[j+1])<0) {
					String temp = str[j];
					str[j] = str[j+1];
					str[j+1] = temp;
				}
			}
		}
		
		for (String string : str) {
			System.out.println(string + " ");
		}
	}

}
