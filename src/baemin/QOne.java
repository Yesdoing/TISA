package baemin;

import java.util.ArrayList;
import java.util.Scanner;

public class QOne {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt(); // 베짱이의 수
			int d = s.nextInt(); // 방향 1: 시계방향 0:역시계방
			int k = s.nextInt(); // 이동횟수
			int j = s.nextInt(); // 탈락자 선택후 이동횟수 추가

			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = i + 1;
			}

			winner(arr, n - 1, d, k, j, 0, k);

		}
	}

	public static void winner(int[] arr, int n, int d, int k, int j, int s, int pk) {
		if (n == 0) {
			for(int i=0; i<arr.length; i++) {
				if(arr[i] != 0) System.out.print(arr[i]);
			}
			return;
		} else if (d == 1) {
			if (s == arr.length - 1) {
				if (arr[s] == 0) {
					winner(arr, n, d, k, j, 0, pk);
				} else if (pk == 0) {
					arr[s] = 0;
					pk = k + j;
					winner(arr, n - 1, d, k + j, j, 0, pk - 1);

				} else {
					winner(arr, n, d, k, j, 0, pk - 1);
				}
			} else {
				if (arr[s] == 0) {
					winner(arr, n, d, k, j, s + 1, pk);
				} else if (pk == 0) {
					arr[s] = 0;
					pk = k + j;
					winner(arr, n - 1, d, k + j, j, s + 1, pk - 1);
				} else {
					winner(arr, n, d, k, j, s + 1, pk - 1);
				}
			}
		} else {
			if (s == 0) {
				if (arr[s] == 0) {
					winner(arr, n, d, k, j, arr.length-1, pk);
				} else if (pk == 0) {
					arr[s] = 0;
					pk = k + j;
					winner(arr, n - 1, d, k + j, j, arr.length-1, pk - 1);
				} else {
					winner(arr, n, d, k, j, arr.length-1, pk - 1);
				}
			} else {
				if (arr[s] == 0) {
					winner(arr, n, d, k, j, s - 1, pk);
				} else if (pk == 0) {
					arr[s] = 0;
					pk = k + j;
					winner(arr, n - 1, d, k + j, j, s - 1, pk - 1);
				} else {
					winner(arr, n, d, k, j, s - 1, pk - 1);
				}
			}
		}

	}
}
