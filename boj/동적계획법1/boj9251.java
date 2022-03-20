package boj;
import java.util.*;
public class boj9251 {
	static char[] A;
	static char[] B;
	static int[] lcs;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		A = str.toCharArray();
		str = sc.next();
		B = str.toCharArray();
		lcs = new int[A.length];
		Arrays.fill(lcs, -1);
	}
}
