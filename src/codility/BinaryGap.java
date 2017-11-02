package codility;

public class BinaryGap {
	public int solution(int n) {
		char[] tmp = Integer.toBinaryString(n).toCharArray();
		int gap = 0, save = 0;

		for (char a : tmp) {
			if (a == '1') {
				if (gap > save) {
					save = gap;
				}
				gap = 0;
			}

			if (a == '0') {
				gap++;
			}
		}

		System.out.println(save);
		return save;
	}

	public static void main(String[] args) {
		BinaryGap bg = new BinaryGap();
		bg.solution(529);
	}
}
