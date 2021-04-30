package assignment_10;

public class Q_25 {

	public static void main(String[] args) {
		String str1 = "12345";
		String str2 = "abcde";
		mergeStrings(str1, str2);

	}

	private static void mergeStrings(String str1, String str2) {
		int l1 = str1.length();
		int l2 = str2.length();
		String combine = "";

		for (int i = 0; i < l1 + l2; i++) {
			String w1 = "";
			String w2 = "";

			if (i < l1) {
				w1 = str1.charAt(i) + "";
			}

			if (i < l2) {
				w2 = str2.charAt(i) + "";
			}

			combine += w1 + w2;
		}

		System.out.println(combine);

	}

}
