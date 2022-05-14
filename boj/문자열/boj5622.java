package boj;
import java.util.*;
public class boj5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int t = 0;
		for(int i = 0; i<str.length(); i++) {
			char a = str.charAt(i);
			if(a < 68) {
				t += 3;
			}else if(a < 71) {
				t += 4;
			}else if(a < 74) {
				t += 5;
			}else if(a < 77) {
				t += 6;
			}else if(a < 80) {
				t += 7;
			}else if(a < 84) {
				t += 8;
			}else if(a < 87) {
				t += 9;
			}else {
				t += 10;
			}
		}
		System.out.println(t);
	}
}
