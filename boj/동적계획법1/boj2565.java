package boj;
import java.util.*;
public class boj2565 {
	static int n;
	static int[] B;
	static int[] max;	// 최장 증가부분수열 길이
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[501];
		n = sc.nextInt();
		B = new int[n];
		max = new int[n];
		for(int i = 0; i<n; i++) {
			int start = sc.nextInt();
			A[start] = sc.nextInt();
		}
		int j = 0;
		for(int i = 1; i<501; i++) {
			if(A[i] != 0) {
				B[j] = A[i];
				j++;
			}
			if(j == n) break;
		}
		Arrays.fill(max, -1);
		for(int i = 0; i<n; i++) {
			dp(i);
		}
		Arrays.sort(max);
		System.out.println(n - max[n-1]);
	}
	static int dp(int i) {
		if(max[i] == -1) {
			max[i] = 1;
			for(int k = i-1; k>=0; k--) {
				if(B[k] < B[i]) {
					max[i] = Math.max(max[i], dp(k) + 1);
				}
			}
		}
		return max[i];
	}
}
