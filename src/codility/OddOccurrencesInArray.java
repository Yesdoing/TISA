package codility;

public class OddOccurrencesInArray {
	public int solution(int[] A) {
		int result = 0;
		int odd  = 0;
		int even = 0;
		int diffNum1 = 0;
		int diffNum2 = 0;
		for(int i=0; i<A.length; i++) {
			if(i % 2 == 0) odd =A[i];  
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		OddOccurrencesInArray oa = new OddOccurrencesInArray();
		int[] data = { 9, 3, 9, 3, 9, 7, 9};
		System.out.println(oa.solution(data));
		
	}

}
