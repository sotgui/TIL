package boj;
import java.util.*;
public class boj2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() - 1;
		int i = 1;
		while(n>0) {
			n -= i * 6;
			i++;
		}
		System.out.println(i);
	}
}
