package assignment_10;

public class Q_21 {

	public static void main(String[] args) {

		System.out.println(prefix("abkkKKKGabk",3));
		
	}
public static boolean prefix(String str,int n) {
	String str1=str.substring(0,n);
	int count = 0;
	int lastIndex = 0;
boolean flag=true;
	
	while ((lastIndex = str.indexOf(str1, lastIndex)) != -1) {
		count++;
		lastIndex += str.length() - 1;
	
}
	if(count==n) {
		 flag=true;
	}else {
		 flag=false;
	}
	return flag;
}
}
