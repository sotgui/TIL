package boj;
import java.util.*;
public class boj1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 1;
		int y = 1;
		for(int i = 1; i<n; i++) {
			if(x == 1) {
				x = y + 1;
				y = 1;
			}else{
				x--;
				y++;
			}
		}
		System.out.println(y + "/" + x);
	}
}
