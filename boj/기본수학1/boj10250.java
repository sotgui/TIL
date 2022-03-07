package boj;
import java.util.*;
public class boj10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int k = 0; k<t; k++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			int ans = ((n-1) / h) + 1 + (n % h) * 100;
			if(n%h == 0) {
				ans += h * 100;
			}
			System.out.println(ans);
		}
	}
}
