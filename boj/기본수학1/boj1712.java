package boj;
import java.util.*;
public class boj1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int n = 0;
		if((c-b) <= 0) {
			n = -1;
		}else {
			n = a / (c - b) + 1; 
		}
		System.out.println(n);
	}
}
