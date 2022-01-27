package boj;
import java.util.*;
public class boj10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] answer = new int[26];
		Arrays.fill(answer, -1);
		for(int i = 0; i<s.length(); i++) {
			int n = (int)(s.charAt(i)) - 97;
			if(answer[n] == -1) {
				answer[n] = i;
			}
		}
		for(int i = 0; i<26; i++) {
			System.out.print(answer[i] + " ");
		}
		
		//System.out.print((int)'z');
		//a = 97
		//z = 122
		//System.out.print(122-97);
	}
}
