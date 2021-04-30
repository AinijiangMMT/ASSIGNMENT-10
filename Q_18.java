package assignment_10;

public class Q_18 {

	public static void main(String[] args) {

		System.out.println(bigStr("This", "And", 1));

	}

	public static String bigStr(String word, String sep, int count) {

		String str = word;
		for (int i = 1; i < count; i++) {

			str += sep + word;

		}
		return str;
	}
}
