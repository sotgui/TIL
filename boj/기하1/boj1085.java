package boj;
import java.util.*;
public class boj1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] pos = new int[4];
		for(int i = 0; i<4; i++) {
			pos[i] = sc.nextInt();
		}
		pos[2] = pos[2] - pos[0];
		pos[3] = pos[3] - pos[1];
		Arrays.sort(pos);
		System.out.println(pos[0]);
	}
}
