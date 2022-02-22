package boj;
import java.util.*;
public class boj10844 {
	static int n;
	static int[][] ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ans = new int[n+1][10];
		for(int[] arr : ans) {
			Arrays.fill(arr, -1);
		}
		int answer = 0;
		for(int i = 1; i<10; i++) {
			answer += stairNum(n, i);
		}
		System.out.println(answer);
	}
	static int stairNum(int num, int i) {
		if(num == 1) {
			return 1;
		}
		if(ans[num][i] == -1) {
			if(i == 0) {
				ans[num][i] = stairNum(n-1, 1) % 1000000000;
			}else if(i == 9) {
				ans[num][i] = stairNum(n-1, 8) % 1000000000;
			}else {
				ans[num][i] = stairNum(n-1, i-1) + stairNum(n-1, i+1);
				ans[num][i] %= 1000000000;
			}
		}
		return ans[num][i];
	}
}
