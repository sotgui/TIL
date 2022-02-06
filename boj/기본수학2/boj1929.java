package boj;
import java.util.*;
public class boj1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		boolean[] dead = new boolean[n+1];	// 걸러짐 : true
		for(int i = 2; i<Math.sqrt(n); i++) {	// 체
			for(int j = 2 ; j<n; j++) {
				if(j != i && j % i == 0) {
					dead[j] = true;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = m; i<n; i++) {
			if(!dead[i]) {
				sb.append(i + "\n");
			}
		}
		System.out.println(sb);
	}
}
