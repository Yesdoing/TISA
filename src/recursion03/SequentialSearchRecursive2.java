package recursion03;

public class SequentialSearchRecursive2 {
	static int search(int[] data, int begin, int end, int target) {
		if(begin > end) {
			return -1;
		} else {
			int middle = (begin + end) / 2;
			if( data[middle] == target) {
				return middle;
			} 
			
			int index = search(data, begin, middle-1, target);
			if(index != -1) {
				return index;
			} else {
				return search(data, middle+1, end, target);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] data = {1, 2, 3, 4};
		int result = search(data, 0, data.length, 1);
		System.out.println(result);
	}
}
