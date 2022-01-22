package boj;
import java.util.*;
public class boj11650 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[][] xy = new int[n][2];
		for(int i = 0; i<n; i++) {
			xy[i][0] = sc.nextInt();
			xy[i][1] = sc.nextInt();
		}
		Comparator<int[]> comp = new Comparator<int[]>() {
			public int compare(int[] a1, int[] a2) {
				if(a1[0] == a2[0]) {
					return a1[1] - a2[1];
				}else {
					return a1[0] - a2[0];
				}
			}
		};
		Arrays.sort(xy, comp);
		for(int i = 0; i<n; i++) {
			System.out.println(xy[i][0] + " " + xy[i][1]);
		}
	}
}
