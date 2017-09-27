package recursion02;

public class StringLength {

	public static void main(String[] args) {
		System.out.println(length("Ace"));
	}

	public static int length(String str) {
		if( str.equals("") ) {
			return 0;
		} else {
			return 1 + length(str.substring(1));
		}
	}
}
