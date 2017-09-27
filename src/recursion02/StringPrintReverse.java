package recursion02;

public class StringPrintReverse {
	public static void printCharsReverse(String str) {
		if (str.length() == 0) {
			return ;
		} else {
			printCharsReverse(str.substring(1));
			System.out.print(str.charAt(0));
		}
	}
	
	public static void main(String[] args) {
		printCharsReverse("apple");
	}
}
