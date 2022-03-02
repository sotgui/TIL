package boj;
import java.util.*;
public class boj11053 {
	static int n;
	static int[] arr;
	static int[] max;
	static int[] len;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		max = new int[n];
		len = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.fill(max, -1);
		Arrays.fill(len, -1);
		int m = dp(n-1);
		System.out.println(len[n-1]);
	}
	static int dp(int i) {
		if(i == 0) {
			max[i] = arr[i];
			len[i] = 1;
		}
		if(max[i] == -1) {
			if(dp(i-1) < arr[i]) {
				len[i] = len[i-1] + 1;
				max[i] = arr[i];
			}else {
				len[i] = len[i-1];
				max[i] = max[i-1];
			}
		}
		return max[i];
	}
}
