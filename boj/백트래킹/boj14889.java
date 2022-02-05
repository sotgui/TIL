package boj;
import java.util.*;
public class boj14889 {
	static int n;
	static int[][] s;
	static boolean[] isTeam1;
	static int score1 = 0;
	static int score2 = 0;
	static int min = 40000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		s = new int[n][n];
		isTeam1 = new boolean[n];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				s[i][j] = sc.nextInt();
			}
		}
		dfs(0, 0);
		System.out.println(min);
	}
	static void dfs(int start, int depth) {		
		// 시간초과 이슈를 피하기 위해 start 추가 (앞 번호 사람을 다시 넣어볼 필요 없음)
		if(depth == n / 2) {	// 팀1에 절반이 들어가면 탐색 종료
			getScore();
			int gap = Math.abs(score1 - score2);
			if(gap < min) {
				min = gap;
			}
			return;
		}
		for(int i = start; i<n; i++) {
			if(!isTeam1[i]) {
				isTeam1[i] = true;
				dfs(i, depth + 1);
				isTeam1[i] = false;
			}
		}
	}
	static void getScore() {
		score1 = 0;
		score2 = 0;
		for(int i = 0; i<n; i++) {
			if(isTeam1[i]) {
				for(int j = i+1; j<n; j++) {
					if(isTeam1[j]) {
						score1 += s[i][j];
						score1 += s[j][i];
					}
				}
			}
			if(!isTeam1[i]) {
				for(int j = i+1; j<n; j++) {
					if(!isTeam1[j]) {
						score2 += s[i][j];
						score2 += s[j][i];
					}
				}
			}
		}
	}
}
