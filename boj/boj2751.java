package boj;

import java.util.*;

public class boj2751 {

	public static void main(String[] args) {
		// 수 정렬하기
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i<n; i++) {
			arr.add(sc.nextInt());
		}
		Collections.sort(arr);
		for(int i : arr) {
			sb.append(i).append('\n');
		}
		System.out.println(sb);
	}

}
