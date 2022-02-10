package boj;
import java.util.*;
public class boj1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		int nPrime = 0;
		for(int j = 0; j<n; j++) {
			int num = nums[j];
			int count = 0;
			for(int i = 1; i<=num; i++) {
				if(num % i == 0) {
					count++;
				}
			}
			if(count == 2) {
				nPrime++;
			}
		}
		System.out.println(nPrime);
		
	}
}
