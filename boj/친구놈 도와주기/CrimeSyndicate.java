package boj;
import java.util.*;
public class CrimeSyndicate {
	static int count = 0;
	static int n;
	static int[][] info;
	static boolean[] arrested;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int k = 0; k<t; k++) {
			n = sc.nextInt();
			int d = sc.nextInt();
			int c = sc.nextInt();
			info = new int[n+1][n+1];
			for(int i = 0; i<c; i++) {
				int member = sc.nextInt();
				int nextMember = sc.nextInt();
				info[member][nextMember] = 1;
			}
			arrested = new boolean[n+1];
			int max = 0;
			int first = 1;
			for(int i = 1; i<n+1; i++) {
				count = 0;
				Arrays.fill(arrested, false);
				track(i, d+1);
				if(count > max) {
					max = count;
					first = i;
				}
			}
			System.out.println("#" + (k+1) + " " + first + " " + max);
		}
	}
	static void track(int mem, int depth) {
		if(depth == 0) {
			return;
		}
		if(!arrested[mem]) {
			arrested[mem] = true;
			count++;
		}
		for(int i = 1; i<n+1; i++) {
			if(mem == i) continue;
			if(info[mem][i] == 1) {
				track(i, depth - 1);
			}
		}
		return;
	}
}
