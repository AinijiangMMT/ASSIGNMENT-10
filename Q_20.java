package assignment_10;

public class Q_20 {

	public static void main(String[] args) {

		System.out.println(factorial(3));

	}

	public static int factorial(int num) {
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		return factorial;
	}

}
