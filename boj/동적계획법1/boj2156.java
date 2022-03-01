package boj;
import java.util.*;
public class boj2156 {
	static int n;
	static int[] wine;
	static int[] score;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		wine = new int[n+1];
		score = new int[n+1];
		for(int i = 1; i<n+1; i++) {
			wine[i] = sc.nextInt();
		}
		Arrays.fill(score, -1);
		System.out.println(getScore(n));
	}
	static int getScore(int i) {
		if(i == 0) {
			score[i] = 0;
		}
		if(i == 1) {
			score[i] = wine[i];
		}
		if(i == 2) {
			score[i] = wine[i] + wine[i-1];
		}
		if(score[i] == -1) {
			score[i] = Math.max( wine[i] + Math.max(getScore(i-2), getScore(i-3) + wine[i-1]) , getScore(i-1) );
		}
		return score[i];
	}
	
}
