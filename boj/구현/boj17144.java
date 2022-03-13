package boj;
import java.util.*;
public class boj17144 {
	static int r;
	static int c;
	static int t;
	static int[][] A;
	static int upper;	// 공기청정기 위치
	static int lower;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		t = sc.nextInt();
		A = new int[r][c];
		for(int i = 0; i<r; i++) {
			for(int j = 0; j<c; j++) {
				A[i][j] = sc.nextInt();
				if(A[i][j] == -1) {		// 공기청정기 위치 저장
					if(upper == 0) {
						upper = i;
					}else {
						lower = i;
					}
				}
			}
		}	// 입력
		for(int i = 0; i<t; i++) {
			diffuse();
			clean();
		}
		int answer = 0;
		for(int i = 0; i<r; i++) {
			for(int j = 0; j<c; j++) {
				if(A[i][j] != -1) {
					answer += A[i][j];
				}
			}
		}
		System.out.println(answer);
	}
	/** 1. 확산
	 * 1) 네 방향으로 확산 (a/5)
	 * 	- 공기청정기 validation
	 * 	- 끝칸 validation
	 * 	- 확산된 칸 개수 count
	 */
	static void diffuse() {
		int[][] after = new int[r][c];
		for(int i = 0; i<r; i++) {
			for(int j = 0; j<c; j++) {	// 모든칸에 대해
				if(A[i][j] == -1) continue;	// 공청 패스
				if(A[i][j] != 0) {		// 미세먼지가 있다면
					int count = 0;
					if(i+1 < r) {
						after[i+1][j] += A[i][j] / 5;
						count++;
					}
					if(i-1 >= 0) {
						after[i-1][j] += A[i][j] / 5;
						count++;
					}
					if(j+1 < c) {
						after[i][j+1] += A[i][j] / 5;
						count++;
					}
					if(j-1 == 0 && i != upper && i != lower) {
						after[i][j-1] += A[i][j] / 5;
						count++;
					}else if(j-1 > 0) {
						after[i][j-1] += A[i][j] / 5;
						count++;
					}	// 왼쪽 확산은 1열 구분(공청)
					A[i][j] -= A[i][j] / 5 * count;
				}
			}
		} // 모든칸 after 작성 완
		for(int i = 0; i<r; i++) {
			for(int j = 0; j<c; j++) {
				A[i][j] += after[i][j];	// 결과 저장
			}
		}
	}
	/** 2. 공기청정기 작동
	 * 	- 위쪽은 반시계
	 * 	- 아래쪽은 시계
	 * 	- 미세먼지 한칸씩 이동
	 * 	- 공기청정기에 도달하면 미세먼지 사라짐
	 */
	static void clean() {
		int[][] after = new int[r][c];
		for(int i = 0; i<r; i++) {
			for(int j = 0; j<c; j++) {
				after[i][j] = A[i][j];
			}
		}
		// upper
		for(int j = 1; j<c-1; j++) {
			after[upper][j+1] = A[upper][j];
			after[0][j-1] = A[0][j];
		}
		for(int i = 1; i<upper; i++) {
			after[i-1][c-1] = A[i][c-1];
			after[i+1][0] = A[i][0];
		}
		// 코너 이동
		after[upper-1][c-1] = A[upper][c-1];
		after[0][c-2] = A[0][c-1];
		after[1][0] = A[0][0];
		after[upper][1] = 0;	// 깨끗한 바람
		// clean
		after[upper][0] = -1;
		
		// lower
		for(int j = 1; j<c-1; j++) {
			after[lower][j+1] = A[lower][j];
			after[r-1][j-1] = A[r-1][j];
		}
		for(int i = lower; i<r-1; i++) {
			after[i-1][0] = A[i][0];
			after[i+1][c-1] = A[i][c-1];
		}
		// 코너 이동
		after[lower+1][c-1] = A[lower][c-1];
		after[r-1][c-2] = A[r-1][c-1];
		after[r-2][0] = A[r-1][0];
		after[lower][1] = 0;	// 깨끗한 바람
		// clean
		after[lower][0] = -1;
		
		for(int i = 0; i<r; i++) {
			for(int j = 0; j<c; j++) {
				A[i][j] = after[i][j];
			}
		}	// 결과 저장
	}
}
