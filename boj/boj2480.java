package boj;
import java.util.*;
public class boj2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int reward = 0;
		if(a == b && b == c) {
			reward = 10000 + 1000 * a;
		}else if(a == b) {
			reward = 1000 + 100 * a;
		}else if(b == c) {
			reward = 1000 + 100 * b;
		}else if(c == a) {
			reward = 1000 + 100 * c;
		}else {
			reward = 100 * Math.max(a, Math.max(b, c));
		}
		System.out.println(reward);
	}
}
