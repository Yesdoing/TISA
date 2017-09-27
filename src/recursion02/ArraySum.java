package recursion02;

public class ArraySum {
	public static int sum(int n, int[] data) {
		if ( n <= 0) {
			return 0;
		} else {
			return sum(n-1, data) + data[n-1];
		}
	}
	
	public static void main(String[] args) {
		int[] data = {1, 2, 3};
		System.out.println(sum(data.length, data));
	}
}
