package recursion03;

public class BinarySearch {
	public static int binarySearch(String[] items, String target, int begin, int end) {
		if (begin > end) {
			return -1;
		} else {
			int middle = (begin + end) / 2;
			int compResult = target.compareTo(items[middle]);
			if(compResult == 0) {
				return middle;
			} else if ( compResult < 0) {
				return binarySearch(items, target, begin, middle-1);
			} else {
				return binarySearch(items, target, middle+1, end);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] items = {"Array", "Binary", "Carrot", "Deploy", "Eliot", "Fight", "Grade"};
		int result = binarySearch(items, "Deploy", 0, items.length-1);
		
		System.out.println( result);
	}
}
