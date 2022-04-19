package boj;
import java.util.*;
public class boj1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		int[] count = new int[26];
		int max = 0;
		char answer = '-';
		for(int i = 0; i<str.length(); i++) {
			char a = str.charAt(i);
			count[(int)a - 65]++;
		}
		for(int i = 0; i<26; i++) {
			if(max < count[i]) {
				max = count[i];
				answer = (char)(i+65);
			}else if(max == count[i]) {
				answer = '?';
			}
		}
		System.out.println(answer);
		// A = 65
	}
}
