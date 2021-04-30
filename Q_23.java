package assignment_10;

public class Q_23 {

	public static void main(String[] args) {

		

		String word = "breadbutterbread";
		int firstBreadIndex = word.indexOf("bread");
		int secondBreadIndex = word.indexOf("bread", firstBreadIndex + 1);

		String str = word;

		str = str.replaceFirst("bread", "");

		if (str.contains("bread")) {
			str = word.substring(firstBreadIndex + 5, secondBreadIndex);
			System.out.println(str);
		} else {
			System.out.println("nothing!");
		}
	}

}
