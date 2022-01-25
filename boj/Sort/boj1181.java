package boj;
import java.util.*;
public class boj1181 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		for(int i = 0; i<n; i++) {
			str[i] = sc.next();
		}
		Comparator<String> comp = new Comparator<String>() {
			public int compare(String str1, String str2) {
				if(str1.length() == str2.length()) {
					return str1.compareTo(str2);
				}else {
					return str1.length() - str2.length();
				}
			}
		};
		Arrays.sort(str, comp);
		System.out.println(str[0]);
		for(int i = 1; i<n; i++) {
			if(!str[i].equals(str[i-1])) {
				System.out.println(str[i]);
			}
		}
	}
}
