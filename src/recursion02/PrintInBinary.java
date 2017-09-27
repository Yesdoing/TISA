package recursion02;

public class PrintInBinary {
	public static void printInBinary(int n) {
		if( n < 2) {
			System.out.print(n);
		} else {
			printInBinary(n/2);
			System.out.print(n%2);
		}
	}
	
	public static void main(String[] args) {
		printInBinary(10);
	}
}
