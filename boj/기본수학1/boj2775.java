package boj;
import java.util.*;
public class boj2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[][] dweller = new int[15][15];
		for(int i = 0; i<15; i++) {
			dweller[0][i] = i;
		}
		for(int i = 0; i<t; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			for(int x = 1; x<=k; x++) {
				dweller[x][0] = dweller[x-1][0];
				for(int y = 1; y<=n; y++) {
					if(dweller[x][y] == 0) {
						int temp = y;
						while(temp>0) {
							dweller[x][y] += dweller[x-1][temp];
							temp--;
						}
					}
				}
			}
			System.out.println(dweller[k][n]);
		}
	}
}
