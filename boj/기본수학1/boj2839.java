package boj;
import java.util.*;
public class boj2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int bongji = n / 5;
		int ans = 0;
		for(int i = bongji; i>=0; i--) {
			int remain = n - 5 * i;
			if(remain == 0) {
				ans = i;
				break;
			}else if(remain % 3 == 0) {
				ans = i + remain / 3;
				break;
			}else {
				ans = -1;
			}
		}
		System.out.println(ans);
	}
}
