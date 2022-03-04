package boj;
import java.util.*;
public class boj11053 {
	static int n;
	static int[] arr;
	static int[] max;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		max = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.fill(max, -1);
		System.out.println(dp(n-1));
	}
	static int dp(int i) {
		if(max[i] == -1) {
			max[i] = 1;
			for(int j = i-1; j>=0; j--) {
				if(arr[j] < arr[i]) {
					max[i] = Math.max(max[i], dp(j) + 1);
				}
			}
		}
		return max[i];
	}
}
