package baemin;

import java.util.Scanner;

public class QThree {
	public static void main(String[] args) {

		try (Scanner s = new Scanner(System.in)) {
			int x1 = s.nextInt();
			int y1 = s.nextInt();
			int x2 = s.nextInt();
			int y2 = s.nextInt();
			int x3 = s.nextInt();
			int y3 = s.nextInt();
			int x4 = s.nextInt();
			int y4 = s.nextInt();
			int x5 = s.nextInt();
			int y5 = s.nextInt();
			int x6 = s.nextInt();
			int y6 = s.nextInt();

			// 여기부터 작성해 주세요
			int[][] arr = new int[10000][10000];

			for (int i = y1; i < y2; i++) {
				for (int j = x1; j < x2; j++) {
					arr[i][j]++;
				}
			}

			for (int i = y3; i < y4; i++) {
				for (int j = x3; j < x4; j++) {
					arr[i][j] = 0;
				}
			}

			for (int i = y5; i < y6; i++) {
				for (int j = x5; j < x6; j++) {
					arr[i][j] = 0;
				}
			}

			int size = 0;
			for (int i = 0; i < 10000; i++) {
				for (int j = 0; j < 10000; j++) {
					if (arr[i][j] == 1)
						size++;
				}
			}

			System.out.println(size);

		}

	}
}
