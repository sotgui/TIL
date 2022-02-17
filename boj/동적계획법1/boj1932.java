package boj;
import java.util.*;
public class boj1932 {
	static int n;
	static int[][] triangle;
	static int[][] max;
	static int[] sum;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		triangle = new int[n][n];
		max = new int[n][n];
		sum = new int[n];
		for(int[] arr : max) {
			Arrays.fill(arr, -1);
		}
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<=i; j++) {
				triangle[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i<n; i++) {
			sum[i] = getMax(n-1, i);
		}
		Arrays.sort(sum);
		System.out.println(sum[n-1]);
		
	}
	static int getMax(int depth, int i) {
		if(depth == 0) {
			max[depth][i] = triangle[depth][i];
		}
		if(max[depth][i] == -1) {
			if(i == 0) {
				max[depth][i] = triangle[depth][i] + getMax(depth-1, i);
			}else if(i == depth) {
				max[depth][i] = triangle[depth][i] + getMax(depth-1, i-1);
			}else {
				max[depth][i] = triangle[depth][i] + Math.max(getMax(depth-1, i), getMax(depth-1, i-1));
			}
		}
		return max[depth][i];
	}
}
