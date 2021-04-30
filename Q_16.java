package assignment_10;

import java.util.Scanner;

public class Q_16 {

	public static void main(String[] args) {
		System.out.println("enter your input:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println(word(str));

	}

	public static boolean word(String str) {
		if ("java".equals(str.substring(0, 4))  || "java".equals(str.substring(1, 5)) ) {
			return true;
		} else {
			return false;
		}
	}
}
