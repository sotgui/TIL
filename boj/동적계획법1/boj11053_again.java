package boj;
import java.util.*;
public class boj11053_again {
	static int n;
	static int[] a;
	static int[] length;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		length = new int[n];
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.fill(length, -1);
		for(int i = 0; i<n; i++) {	// 부분 수열에서 최대 길이가 나올 수도 있음!!
			dp(i);
		}
		Arrays.sort(length);
		System.out.println(length[n-1]);
	}
	
	static int dp(int k) {
		if(length[k] == -1) {
			length[k] = 1;		// 기본으로 길이 1이므로 항상 1로 초기화
			for(int i = k-1; i>=0; i--) {
				if(a[i] < a[k]) {	// 
					length[k] = Math.max(length[k], dp(i) + 1);
				}
			}
		}
		return length[k];
	}
}
