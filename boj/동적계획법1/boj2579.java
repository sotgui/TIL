package boj;
import java.util.*;
public class boj2579 {
	static int n;
	static int[] stair;
	static int[] score;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		stair = new int[n+1];
		score = new int[n+1];
		Arrays.fill(score, -1);
		for(int i = 1; i<=n; i++) {
			stair[i] = sc.nextInt();
		}
		System.out.println(getScore(n));
	}
	static int getScore(int i) {
		if(i == 0) {
			score[i] = stair[i];
		}
		if(i == 1) {
			score[i] = stair[i];
		}
		if(i == 2) {
			score[i] = stair[i-1] + stair[i];
		}
		if(score[i] == -1) {
			score[i] = Math.max(getScore(i-2), getScore(i-3) + stair[i-1]) + stair[i];
		}
		return score[i];
	}
}
