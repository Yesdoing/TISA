package baeminSecondTest;

public class Four {
	public static void main(String[] args) {
		int A[] = {-1, 1, 3, 3, 3, 2, 1, 0, -1};
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		int diffNumber = compareNumbers(A[0], A[1]);
		int result = 0;
		int numCount = 1;
		for (int i = 2; i < A.length; i++) {
			if(diffNumber == compareNumbers(A[i], A[i-1])) {
				numCount++;
				if(numCount == 2) {
					result++;					
				} 
				
				if(numCount > 2) {
					result += (numCount-1);
				}
				
			} else {
				diffNumber = compareNumbers(A[i], A[i-1]);
				numCount = 1;
			}
		}

		return result;
	}

	static int compareNumbers(int a, int b) {
		int c = (a>b) ? a-b : b-a;
		return c;
	}
}
