package boj;
import java.util.*;
public class boj11047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int remain = k;
		int count = 0;
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = n-1; i>=0; i--) {
			if(a[i] > remain) continue;
			count += remain / a[i];
			remain = remain % a[i];
		}
		System.out.println(count);
	}
}
