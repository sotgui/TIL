package boj;
import java.util.*;
public class boj10757_again {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		char[] a = new char[10001];
		char[] b = new char[10001];
		int[] c = new int[10001];
		int plus = 0;
		Arrays.fill(a, '0');
		Arrays.fill(b, '0');
		for(int i = 10001 - A.length(); i<10001; i++) {
			a[i] = A.charAt(i+ A.length() - 10001);
		}
		for(int i = 10001 - B.length(); i<10001; i++) {
			b[i] = B.charAt(i+ B.length() - 10001);
		}
		for(int i = 10000; i>=0; i--) {
			c[i] += a[i] + b[i] - '0' - '0';
			if(c[i] >= 10) {
				if(i == 0) {
					plus = c[i] / 10;
				}else {
					c[i-1] = c[i] / 10;
				}
				c[i] -= 10;
			}
		}
		if(plus != 0) {
			System.out.print(plus);
		}
		int start = 0;
		for(int i = 0; i<10001; i++) {
			if(c[i] != 0) {
				start = i;
				break;
			}
		}
		for(int i = start; i<10001; i++) {
			System.out.print(c[i]);
		}
	}
}
