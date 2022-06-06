package boj;
import java.util.*;
public class boj2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		int min = 10000;
		for(int i = m; i<=n; i++) {
			for(int j = 2; j<=i; j++) {
				if(j == i) {
					sum += i;
					if(min > i) {
						min = i;
					}
				}
				if(i % j == 0) {
					break;
				}
			}
		}
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
