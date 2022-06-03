package boj;
import java.util.*;
public class boj4153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true) {
			count = 0;
			int[] l = new int[3];
			for(int i = 0; i<3; i++) {
				l[i] = sc.nextInt();
				if(l[i] == 0) {
					count++;
				}
			}
			if(count == 3) break;
			Arrays.sort(l);
			if(l[2]*l[2] == l[0]*l[0] + l[1]*l[1]) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}
	}
}
