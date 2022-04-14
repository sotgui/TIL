package boj;
import java.util.*;
public class boj1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i = 1; i<=n; i++) {
			if(i < 100) {
				count++;
			}else {
				int a = i / 100;
				int b = i % 100 / 10;
				int c = i % 10;
				if((a - b) == (b - c)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
