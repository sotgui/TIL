package boj;
import java.util.*;
public class boj1149 {
	static int[] color;
	static int[][] cost; 
	static int n;
	static int[][] total;	
	static int min = 1000000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		color = new int[n];
		cost = new int[n][3]; 	// 0 Red , 1 Green , 2 Blue
		total = new int[n][3];
		for(int[] h : cost) {
			for(int i = 0; i<3; i++) {
				h[i] = sc.nextInt();
			}
		}
		total[0][0] = cost[0][0];
		total[0][1] = cost[0][1];
		total[0][2] = cost[0][2];
		for(int i = 0; i<n-1; i++) {
			total[i+1][0] = cost[i+1][0] + Math.min(total[i][1], total[i][2]);
			total[i+1][1] = cost[i+1][1] + Math.min(total[i][0], total[i][2]);
			total[i+1][2] = cost[i+1][2] + Math.min(total[i][0], total[i][1]);
		}
		System.out.println(Math.min(Math.min(total[n-1][0], total[n-1][1]), total[n-1][2]));
	}
}
