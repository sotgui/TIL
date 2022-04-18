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
			max = new int[n-m][n-m];
			for(int i = 0; i<n; i++) {
				for(int j = 0; j<n; j++) {
					honey[i][j] = sc.nextInt();
				}
			}
			for(int i = 0 ;i<n-m; i++) {
				for(int j = 0; j<n-m; j++) {
					max[i][j] = -1;
				}
			}
			// max 구하기
			getMax(n-m-1, n-m-1);
			// 
			System.out.println("#" + (k+1) + " " + max[n-m-1][n-m-1]);
		}
	}
	static int getMax(int i, int j) {
		if(i == 0) {
			if(j == 0) {
				max[i][j] = getHoney(i,j);
			}
		}
		else if(j == 0) {
			max[i][j] = Math.max(getMax(i-1, n-m-1), max[i-1][n-m-1] + getHoney(i,j));
		}	// getMax(i-1, n-m-1) + getHoney(i,j)
		if(max[i][j] == -1) {
			max[i][j] = Math.max(getMax(i, j-1), max[i][j-1] + getHoney(i,j));
		}	// getMax(i,j-1) + getHoney(i,j)
		return max[i][j];
	}
	static int getHoney(int i, int j) {
		int h = 0;
		for(int x = j; x<j+m; x++) {
			h += honey[i][x];
		}
		if(h > c) return 0;
		else return getProfit(i,j);
	}
	static int getProfit(int i, int j) {
		int profit = 0;
		for(int x = j; x<j+m; x++) {
			profit += honey[i][x] * honey[i][x];
		}
		return profit;
	}
}
