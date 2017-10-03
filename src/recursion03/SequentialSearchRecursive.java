package recursion03;

public class SequentialSearchRecursive {
	static int search(int[] data, int begin, int end, int target) {
		if(begin > end) {
			return -1;
		} else if (target == data[begin]) {
			return begin;
		} else {
			return search(data, begin+1, end, target);
		}
	}
	
	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5, 6, 7};
		int result = search(data, 0, data.length, 4);
		System.out.println(result);
	}
}
