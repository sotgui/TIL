package boj;
import java.util.*;
public class boj9251 {
	static char[] A;
	static char[] B;
	static int[] lcs;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		A = str.toCharArray();
		str = sc.next();
		B = str.toCharArray();
		lcs = new int[A.length];
		Arrays.fill(lcs, -1);
		for(int i = 0; i<A.length; i++) {
			dp(i);
		}
		System.out.println(lcs[A.length - 1] + 1);
	}

	static int dp(int k) {
		if(lcs[k] == -1) {
			lcs[k] = 1;		// 기본으로 길이 1이므로 항상 1로 초기화
			for(int i = k-1; i>=0; i--) {
				if(A[i] == B[k]) {	// 
					lcs[k] = Math.max(lcs[k], dp(i) + 1);
				}
			}
		}
		return lcs[k];
	}
}
