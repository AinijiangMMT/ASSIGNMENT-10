package assignment_10;

public class Q_19 {

	public static void main(String[] args) {
		System.out.println(duplication("helloja1vahejavalllojava"));

	}

	public static int duplication(String word) {
		int count = 0;
		int lastIndex = 0;

		String str = "java";
		while ((lastIndex = word.indexOf(str, lastIndex)) != -1) {
			count++;
			lastIndex += str.length() - 1;

		}
		return count;
	}
}
