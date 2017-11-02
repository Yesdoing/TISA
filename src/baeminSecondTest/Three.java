package baeminSecondTest;

import java.util.StringTokenizer;

public class Three {
	public static int sol(int N, String S) {
		int number = N * 3;
		int[][] seat = new int[N][10];
		if (!S.trim().equals("") && S != null) {
			StringTokenizer strToken = new StringTokenizer(S, " ");
			while (strToken.hasMoreElements()) {
				String temp = "";
				temp += strToken.nextToken();
				int floor = Integer.parseInt(temp.substring(0, 1)) - 1;
				int chair = strToNumber(temp.substring(1, 2));
				seat[floor][chair] = 1;
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				if (seat[i][j] == 1) {
					number--;
					break;
				}
			}
			for (int j = 4; j < 6; j++) {
				if (seat[i][j] == 1) {
					number--;
					break;
				}
			}
			for (int j = 7; j < 10; j++) {
				if (seat[i][j] == 1) {
					number--;
					break;
				}
			}
		}

		return number;
	}

	public static int strToNumber(String S) {
		if (S.equals("A"))
			return 0;
		else if (S.equals("B")) {
			return 1;
		} else if (S.equals("C")) {
			return 2;
		} else if (S.equals("D")) {
			return 3;
		} else if (S.equals("E")) {
			return 4;
		} else if (S.equals("F")) {
			return 5;
		} else if (S.equals("G")) {
			return 6;
		} else if (S.equals("H")) {
			return 7;
		} else if (S.equals("J")) {
			return 8;
		} else if (S.equals("K")) {
			return 9;
		} else
			return 0;
	}
}
