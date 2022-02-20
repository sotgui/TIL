package boj;
import java.util.*;
public class boj1463 {
	static int n;
	static int[] min;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		min = new int[n+1];
		Arrays.fill(min, -1);
		System.out.println(getMinOp(n));
	}
	static int getMinOp(int i) {
		if(i == 1) min[i] = 0;
		if(i == 2) min[i] = 1;
		if(i == 3) min[i] = 1;
		if(min[i] == -1) {
			if(i%3 == 0) {
				if(i%2 == 0) {
					min[i] = 1 + Math.min(getMinOp(i-1), Math.min(getMinOp(i/3), getMinOp(i/2)));
				}else {
					min[i] = 1 + Math.min(getMinOp(i/3), getMinOp(i-1));
				}
			}else if(i%2 == 0){
				min[i] = 1 + Math.min(getMinOp(i/2), getMinOp(i-1));
			}else {
				min[i] = 1 + getMinOp(i-1);
			}
		}
		return min[i];
	}
}
