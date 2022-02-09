package boj;
import java.util.*;
public class swea1247 {
	static int n;
	static int min = 20000;
	static int total = 0;
	static boolean[] delivered;
	static int[][] customer;
	static int[] company = new int[2];	
	static int[] home = new int[2];
	static int[] order;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int k = 0; k<tc; k++) {
			n = sc.nextInt();
			delivered = new boolean[n];
			customer = new int[n][2];
			order = new int[n];	// 배달 순서
			company[0] = sc.nextInt();
			company[1] = sc.nextInt();
			home[0] = sc.nextInt();
			home[1] = sc.nextInt();			
			for(int i = 0; i<n; i++) {
				customer[i][0] = sc.nextInt();
				customer[i][1] = sc.nextInt();
			}
			dfs(0);
			System.out.println("#" + (k+1) + " " + min);
			min = 20000;
		}
	}
	
	static void dfs(int depth) {
		if(depth == n) {
			getTotal();
			if(total < min) {
				min = total;
			}
			return;
		}
		for(int i = 0; i<n; i++) {
			if(!delivered[i]) {
				delivered[i] = true;
				order[depth] = i;
				dfs(depth+1);
				delivered[i] = false;
			}
		}
	}
	
	static int getDist(int start, int dest) {		
		// 직전 좌표와 해당 depth 방문할 고객 좌표 필요
		int dist = 0;
		if(start == -1) {	// 회사에서 출발
			dist = Math.abs(company[0] - customer[order[dest]][0]) + Math.abs(company[1] - customer[order[dest]][1]);
		}else if(start == n-1) {	// 집으로
			dist = Math.abs(customer[order[start]][0] - home[0]) + Math.abs(customer[order[start]][1] - home[1]);
		}else {
			dist = Math.abs(customer[order[start]][0] - customer[order[dest]][0]) + Math.abs(customer[order[start]][1] - customer[order[dest]][1]);
		}
		return dist;
	}
	
	static void getTotal() {
		total = 0;
		for(int i = -1; i<n; i++) {
			total += getDist(i, i+1);
		}
	}
	
}
