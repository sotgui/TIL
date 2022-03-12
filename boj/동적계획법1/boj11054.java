package boj;
import java.util.*;
public class boj11054 {
	static int n;
	static int[] a;
	static int[] asc;	// 가장 긴 오름차순 수열 길이
	static int[] desc;	// 가장 긴 내림차순 수열 길이
	static int[] ans;	// asc + desc
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		asc = new int[n];
		desc = new int[n];
		ans = new int[n];
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.fill(asc, -1);
		Arrays.fill(desc, -1);
		for(int i = 0; i<n; i++) {
			getAsc(i);
			getDesc(i);
		}
		for(int i = 0; i<n; i++) {
			ans[i] = asc[i] + desc[i] - 1;
		}
		Arrays.sort(ans);
		System.out.println(ans[n-1]);
	}
	static int getAsc(int i) {
		if(asc[i] == -1) {
			asc[i] = 1;
			for(int j = i-1; j>=0; j--) {
				if(a[j] < a[i]) {
					asc[i] = Math.max(asc[i], getAsc(j) + 1);
				}
			}
		}
		return asc[i];
	}
	static int getDesc(int i) {
		if(desc[i] == -1) {
			desc[i] = 1;
			for(int j = i+1; j<n; j++) {
				if(a[j] < a[i]) {
					desc[i] = Math.max(desc[i], getDesc(j) + 1);
				}
			}
		}
		return desc[i];
	}
}
