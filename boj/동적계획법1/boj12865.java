package boj;
import java.util.*;
public class boj12865 {
	static int n;
	static int k;
	static int[] w;
	static int[] v;
	static int[] value;		// value[무게] = 가치
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		w = new int[n];
		v = new int[k+1];
		value = new int[k+1];
		Arrays.fill(value, -1);
		for(int i = 0; i<n; i++) {
			w[i] = sc.nextInt();
			int tmp = sc.nextInt();
			v[w[i]] = Math.max(v[w[i]], tmp);
		}
		int ans = getValue(k);
		System.out.println(getValue(k));
	}
	
	static int getValue(int i) {
		if(i == 0) {
			value[i] = 0;
		}
		if(value[i] == -1) {
			value[i] = Math.max(v[i], getValue(i-1) + v[1]); 
		}
		return value[i];
	}
}
