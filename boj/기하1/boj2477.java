package boj;
import java.util.*;
public class boj2477 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int[][] l = new int[6][2];
		int maxX = 0;
		int maxY = 0;
		int iMaxX = 0;
		int iMaxY = 0;
		for(int i = 0; i<6; i++) {
			l[i][0] = sc.nextInt();
			l[i][1] = sc.nextInt();
			if(l[i][1] > maxX && l[i][0] <= 2) {
				maxX = l[i][1];
				iMaxX = i;
			}
			if(l[i][1] > maxY && l[i][0] > 2) {
				maxY = l[i][1];
				iMaxY = i;
			}
		}
		int iSmallX = iMaxY + 3;
		int iSmallY = iMaxX + 3;
		if(iSmallX >= 6) iSmallX -= 6;
		if(iSmallY >= 6) iSmallY -= 6;
		int a = maxX * maxY - l[iSmallX][1] * l[iSmallY][1];
		System.out.println(a*k);
	}
}
