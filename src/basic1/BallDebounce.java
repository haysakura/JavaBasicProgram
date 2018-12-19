package basic1;

public class BallDebounce {

	public static void main(String[] args) {
		
		double height = 100.0;
		double length = 100;
		for (int i = 2; i <= 10; i++) {
			height /= 2;
			System.out.println("The " + i + "th height is: " + height);
			length += height*2;
			System.out.println("After the " + i + "th landing, the ball has been through " + length + "." );
		}
		
	}

}
