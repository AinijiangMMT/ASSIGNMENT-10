package assignment_10;

import java.util.Scanner;

public class Q_17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter first letter:");
		String str1 = sc.next();
		char char1 = str1.charAt(0);

		System.out.println("enter second  letter:");
		String str2 = sc.next();
		char char2 = str2.charAt(0);
		if (char1 >= char2) {
			System.out.println("invalid input");

		} else
			for (int i = char1; i <= char2; i++) {
				char char3 = (char) i;
				System.out.print(char3);

			}

	}
}