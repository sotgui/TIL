package boj;
import java.util.*;
public class boj3034 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		double dd = Math.pow(w,2) + Math.pow(h,2);
		for(int i = 0; i<n; i++) {
			int match = sc.nextInt();
			if(Math.pow(match, 2) <= dd) {
				System.out.println("DA");
			}else {
				System.out.println("NE");
			}
		}
	}
}
