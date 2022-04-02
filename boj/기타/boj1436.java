package boj;

import java.util.*;

public class boj1436_ {

	public static void main(String[] args) {
		// 영화감독 숌
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		int name = 666;
		
		while(count != n) {
			name++;
			if(Integer.toString(name).contains("666")) {
				count++;
			}
		}
		System.out.println(name);
	}

}
