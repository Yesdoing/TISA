package recursion;

public class Factorial {
	public static void main(String[] args) {
		
	}
	
	public static int factorial(int n) {
		if (n==0) {
			return 1;
		} else {
			return n*factorial(n-1);
		}
	}
}
