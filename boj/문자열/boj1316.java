package boj;
import java.util.*;
public class boj1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i = 0; i<n; i++) {
			String word = sc.next();
			boolean[] flag = new boolean[26];
			for(int j = 0; j<word.length()-1; j++) {
				flag[word.charAt(j)-97] = true;
				if(word.charAt(j+1) != word.charAt(j)) {
					if(flag[word.charAt(j+1)-97] == true) {
						break;
					}
				}
				if(j == word.length() - 2) {
					count++;
				}
			}
			if(word.length() == 1) count++;
		}
		System.out.println(count); //97
	}
}
