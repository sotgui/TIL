package boj;
import java.util.*;
public class swea2115 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int k = 0; k<t; k++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int c = sc.nextInt();
			int[][] honey = new int[n][n];
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
