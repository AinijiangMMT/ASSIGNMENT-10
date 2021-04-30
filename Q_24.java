package assignment_10;

public class Q_24 {

	public static void main(String[] args) {

		String word = "We study java not pythonjava";
		int counterJ = 0;
		int counterP = 0;
		String java = "java";
		String python = "python";

		for (int i = 0; i <= word.length() - java.length(); i++) {
			if (word.substring(i, i + java.length()).equals(java)) {
				counterJ++;
			}
		}

		for (int i = 0; i <= word.length() - python.length(); i++) {
			if (word.substring(i, i + python.length()).equals(python)) {
				counterP++;
			}
		}
		System.out.println(counterJ);
		if (counterJ == counterP) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
