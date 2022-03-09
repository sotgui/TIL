package boj;
import java.util.*;
public class boj1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = n;
		int a = 1;
		int b = 1;
		for(int i = 1; i<=n; i++) {
			if(count - i <= 0) {
				if(i % 2 == 0) {
					a = count;
					b = i - count + 1;
				}else {
					a = i - count + 1;
					b = count;
				}
				break;
			}else {
				count -= i;
			}
		}
		System.out.println(a + "/" + b);
	}
}
