package boj;
import java.util.*;
public class boj14888 {
	static int n;
	static int[] nums;		
	static int[] oper = new int[4];	// + - * /
	static int min = 1000000000;
	static int max = -1000000000;
	static int result = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		nums = new int[n];
		for(int i = 0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		for(int i = 0; i<4; i++) {
			oper[i] = sc.nextInt();
		}
		result = nums[0];
		dfs(0);
		System.out.println(max);
		System.out.println(min);
	}
	static void dfs(int depth) {
		if(depth == n-1) {	// 사실 오퍼레이션은 n-1회만 해주기 때문
			if(result < min) {
				min = result;
			}
			if(result > max) {	// else if 쓰면 틀림! 둘 다 확인 해야함
				max = result;
			}
			return;
		}
		for(int i = 0; i<4; i++) {
			if(oper[i] > 0) {
				oper[i]--;
				getResult(i, depth);
				dfs(depth + 1);
				rollback(i, depth);
				oper[i]++;
			}
		}
	}
	static void getResult(int i, int depth) {
		// i번째 operator를 이용해 depth차의 오퍼레이션 결과를 얻는 함수
		switch(i) {
			case 0:
				result = result + nums[depth+1];
				break;
			case 1:
				result = result - nums[depth+1];
				break;
			case 2:
				result = result * nums[depth+1];
				break;
			case 3:
				result = result / nums[depth+1];
				break;
			default:
				break;
		}
	}
	static void rollback(int i, int depth) {
		switch(i) {
			case 0:
				result = result - nums[depth+1];
				break;
			case 1:
				result = result + nums[depth+1];
				break;
			case 2:
				result = result / nums[depth+1];
				break;
			case 3:
				result = result * nums[depth+1];
				break;
			default:
				break;
		}
	}
	
}
