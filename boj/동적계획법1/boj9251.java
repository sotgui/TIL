package boj;
import java.util.*;
public class boj9251 {
	static char[] A;
	static char[] B;
	static int[] lcs;
	static int l;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int len1 = str1.length();
		int len2 = str2.length();
		if(len1 > len2) {
			l = len1;
			A = str1.toCharArray();
			B = new char[l];
			Arrays.fill(B, ' ');
			for(int i = 0 ; i<len2; i++) {
				B[i] = str2.charAt(i);
			}
		}else {
			l = len2;
			A = str2.toCharArray();
			B = new char[l];
			Arrays.fill(B, '-');
			for(int i = 0 ; i<len1; i++) {
				B[i] = str1.charAt(i);
			}
		}
		lcs = new int[l];
		Arrays.fill(lcs, -1);
		for(int i = l-1; i>=0; i--) {
			dp(i);
		}
		Arrays.sort(lcs);
		System.out.println(lcs[l - 1]);
	}

	static int dp(int k) {
		if(k == 0) {
			if(A[k] == B[k]) {
				lcs[k] = 1;
			}else {
				lcs[k] = 0;
			}
		}
		if(lcs[k] == -1) {
			lcs[k] = 1;		// 기본으로 길이 1이므로 항상 1로 초기화
			for(int i = k; i>=0; i--) {
				if(A[i] == '-' || B[i] == '-') continue;
				if(A[i] == B[k]) {	// 
					lcs[k] = Math.max(lcs[k], dp(k-1) + 1);
				}
			}
		}
		return lcs[k];
	}
}
