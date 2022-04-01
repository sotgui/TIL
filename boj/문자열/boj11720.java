package boj;
import java.util.*;
public class boj11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int sum = 0;
		for(int i = 0; i<n; i++) {
			int temp = Integer.parseInt(str.substring(i,i+1));
			sum += temp;
		}
		System.out.println(sum);
	}
}
