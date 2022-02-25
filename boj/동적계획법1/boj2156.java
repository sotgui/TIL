package boj;
import java.util.*;
public class boj2156 {
	static int n;
	static int[] wine;
	static int[] score;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		wine = new int[n];
		score = new int[n];
		for(int i = 0; i<n; i++) {
			wine[i] = sc.nextInt();
		}
		Arrays.fill(score, -1);
		System.out.println(getScore(n-1));
	}
	static int getScore(int i) {
		if(i == 0) {
			score[i] = wine[i];
		}
		if(i == 1) {
			score[i] = wine[i] + wine[i-1];
		}
		if(i == 2) {
			score[i] = wine[i] + Math.max(wine[i-2], wine[i-1]);
		}
		if(score[i] == -1) {
			score[i] = Math.max(wine[i] + Math.max(getScore(i-3), Math.max(getScore(i-2), getScore(i-3) + wine[i-1])), getScore(i-1));
		}
		return score[i];
	}
}
