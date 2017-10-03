package recursion03;

public class SequentialSearch {
	static int search(int[] data, int n, int target) {
		for (int i = 0; i < n; i++) {
			if (data[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] data = {1, 2, 3, 4, 5, 6};
		
		int result = search(data, data.length, 4);
		System.out.println(result);
	}
}
