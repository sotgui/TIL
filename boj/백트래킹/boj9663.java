package boj;
import java.util.*;
public class boj9663 {
	static int n;
	static int[] queen;
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		queen = new int[n];
		dfs(0);
		System.out.println(count);
	}
	static void dfs(int depth) {
		if(depth == n) {
			count++;
			return;
		}
		for(int i = 0; i<n; i++) {	// 0~n-1까지 넣으며 !isDanger일 때 하위노드로 이동
			queen[depth] = i;	// depth번째에 i를 먼저 넣어줌 : isDanger 검사 시에 queen array 사용하기 위해
			if(!isDanger(depth)) {
				dfs(depth + 1);
			}
		}
	}
	
	static boolean isDanger(int depth) {
		for(int i = 0; i<depth; i++) {
			if(queen[i] == queen[depth]) {
				return true;
			}
			if( Math.abs(i - depth) == Math.abs(queen[i] - queen[depth])) {
				return true;
			}
		}
		
		return false;
	}
}
