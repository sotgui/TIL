package boj;
import java.util.*;
public class boj2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i<t; i++) {
			int r = sc.nextInt();
			String s = sc.next();
			String p = "";
			for(int x = 0; x<s.length(); x++) {
				for(int j = 0; j<r; j++) {
					p = p.concat(Character.toString(s.charAt(x)));
				}
			}
			System.out.println(p);
		}
	}
}
