package boj;
import java.util.*;
public class boj2580 {
	static int[][] sdoku = new int[9][9];
	static int[][] answer = new int[9][9];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<9; i++) {
			for(int j = 0; j<9; j++) {
				sdoku[i][j] = sc.nextInt();
			}
		}
		dfs(0,0);	
	}
	
	static void dfs(int x, int y) {	// depth 대신 x,y = 9 까지
		if(x == 9) {	// 탐색 완료 조건 --> 출력
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i<9; i++) {
				for(int j = 0; j<9; j++) {
					sb.append(sdoku[i][j] + " ");
				}
				sb.append("\n");
			}
			System.out.println(sb);
			System.exit(0);		// 문제에서 1가지만 출력하라고 했으므로 추가.. 안하면 틀림
			return;
		}
		if(y == 9) {
			dfs(x+1, 0);
			return;			
		}
		
		if(sdoku[x][y] == 0) {
			for(int i = 0; i<9; i++) {
				if(!isExist(x, y, i+1)) {
					sdoku[x][y] = i+1;
					dfs(x, y+1);
				}
			}
			sdoku[x][y] = 0;
			return;
		}
		dfs(x, y+1);
	}
	
	static boolean isExist(int x, int y, int n) {
		// sdoku[x][y]가 이미 존재하는지 확인하는 함수
		// 1. 같은 줄에 존재하는가? - 가로/세로
		// 2. 같은 정사각형에 존재하는가?
		for(int i = 0; i<9; i++) {	// 가로 확인
			if(sdoku[x][i] == n) {
				return true;
			}
		}
		for(int i = 0; i<9; i++) {	// 세로 확인
			if(sdoku[i][y] == n) {
				return true;
			}
		}
		
		int squareX = x / 3;	// 몇번째 정사각형인가?
		int squareY = y / 3;		
		for(int i = 3*squareX; i < 3*squareX+3; i++) {
			for(int j = 3*squareY; j < 3*squareY+3; j++) {
				if(sdoku[i][j] == n) {
					return true;
				}
			}
		}

		return false;
	}
}
