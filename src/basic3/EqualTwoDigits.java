package basic3;

public class EqualTwoDigits {

	public static void main(String[] args) {
		int n = 0;
		boolean flag = false;
		
		for (int i = 10; i < 100; i++) {
			if (809*i == 8*i + 9*i + 1) {
				flag = true;
				n = i;
				break;
			}
		}
		if (flag) {
			System.out.println(n);
		}
		else {
			System.out.println("There is no such value!");
		}
	}

}
