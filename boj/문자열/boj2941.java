package boj;
import java.util.*;
public class boj2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count = 0;
		for(int i = 0; i<str.length(); i++) {
			char c, h, a;
			c = str.charAt(i);
			h = '0';
			a = '0';
			if(i+1 < str.length()) h = str.charAt(i+1);
			if(i+2 < str.length()) a = str.charAt(i+2);
			if(c == 'c') {
				if(h == '=' || h == '-') {
					count++;
					i++;
				}else {
					count++;
				}
			}else if(c == 'd') {
				if(h == 'z' && a == '=') {
					count++;
					i += 2;
				}else if(h == '-') {
					count++;
					i++;
				}else {
					count++;
				}
			}else if(c == 'l' && h == 'j') {
				count++;
				i++;
			}else if(c == 'n' && h == 'j') {
				count++;
				i++;
			}else if(c == 's' && h == '=') {
				count++;
				i++;
			}else if(c == 'z' && h == '=') {
				count++;
				i++;
			}else {
				count++;
			}
		}
		System.out.println(count);
	}
}
