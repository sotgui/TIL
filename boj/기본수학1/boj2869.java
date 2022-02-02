package boj;
import java.util.*;
public class boj2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		int answer = 0;
		if((v - a) % (a - b) == 0) {
			answer = 1 + (v - a) / (a - b);
		}else {
			answer = 2 + (v - a) / (a - b);
		}
		System.out.println(answer);
	}
}
