package boj;
import java.util.*;
public class boj1003 {
	static int[][] count = new int[41][2];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		for(int i = 0; i<41; i++) {
			Arrays.fill(count[i], -1);
		}
		int t = sc.nextInt();
		count[0][0] = 1;
		count[0][1] = 0;
		count[1][0] = 0;
		count[1][1] = 1;
		for(int k = 0; k<t; k++) {
			int n = sc.nextInt();
			fibo(n);
			System.out.println(count[n][0] + " " + count[n][1]);
		}
	}
	private static int[] fibo(int n) {
		if(n == 0) {
			return count[0];
		}else if(n == 1) {
			return count[1];
		}else {
			if(count[n][0] == -1) {
				count[n][0] = fibo(n-1)[0] + fibo(n-2)[0];
				count[n][1] = fibo(n-1)[1] + fibo(n-2)[1];
			}
			return count[n];
		}
	}
}
