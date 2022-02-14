package boj;
import java.util.*;
public class boj1904 {
	static int[] nAns;		// int[n] : n크기 2진수열 개수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		nAns = new int[n+1];
		Arrays.fill(nAns, -1);
		System.out.println(getAns(n));
	}
	
	static int getAns(int n) {
		if(n <= 2) {
			nAns[n] = n;
		}
		if(nAns[n] == -1) {
			nAns[n] = (getAns(n-1) + getAns(n-2)) % 15746;
		}
		return nAns[n];
	}
}
