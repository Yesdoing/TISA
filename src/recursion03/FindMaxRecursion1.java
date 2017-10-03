package recursion03;

public class FindMaxRecursion1 {
	static int findMax(int[] data, int begin, int end) {
		if(begin == end) {
			return data[begin];
		} else {
			return Math.max(data[begin], findMax(data, begin+1, end));
		}
	}
	
	public static void main(String[] args) {
		int[] data = {1, 2, 3, 4};
		int result = findMax(data, 0, data.length-1);
		System.out.println(result);
	}
}
	