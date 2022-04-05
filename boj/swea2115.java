package boj;
import java.util.*;
public class swea2115 {
	static int n;
	static int m;
	static int c;
	static int[][] honey;
	static int[][] max;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int k = 0; k<t; k++) {
			n = sc.nextInt();
			m = sc.nextInt();
			c = sc.nextInt();
			honey = new int[n][n];
			int max = 0;
			for(int i = 0; i<n; i++) {
				for(int j = 0; j<n; j++) {
					honey[i][j] = sc.nextInt();
				}
			}
			// max 구하기
			// 
			System.out.println("#" + (k+1) + " " + max);
		}
	}
	
	
}
