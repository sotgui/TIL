package boj;
import java.util.*;
public class boj9461 {
	static long[] padovan = new long[101];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Arrays.fill(padovan, -1);
		padovan[0] = 0;
		padovan[1] = 1;
		padovan[2] = 1;
		padovan[3] = 1;
		padovan[4] = 2;
		padovan[5] = 2;
		for(int k = 0; k<t; k++) {
			int n = sc.nextInt();
			System.out.println(getP(n));			
		}
	}
	static long getP(int n) {
		if(padovan[n] == -1) {
			padovan[n] = getP(n-5) + getP(n-1);
		}
		return padovan[n];
	}
}
