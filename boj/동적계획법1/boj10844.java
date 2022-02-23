package boj;
import java.util.*;
public class boj10844 {
	static int n;
	static long[][] ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ans = new long[n+1][10];
		for(long[] arr : ans) {
			Arrays.fill(arr, -1);
		}
		long answer = 0;
		for(int i = 1; i<10; i++) {
			answer += stairNum(n, i);
		}
		answer %= 1000000000;
		System.out.println(answer);
	}
	static long stairNum(int num, int i) {
		if(num == 1) {
			ans[num][i] = 1;
		}
		if(ans[num][i] == -1) {
			if(i == 0) {
				ans[num][i] = stairNum(num-1, 1);
			}else if(i == 9) {
				ans[num][i] = stairNum(num-1, 8);
			}else {
				ans[num][i] = stairNum(num-1, i-1) + stairNum(num-1, i+1);
			}
		}
		return ans[num][i] % 1000000000;
	}
}
