package boj;

public class boj4673 {
	public static void main(String[] args) {
		int n = 10000;
		int[] nConstructor= new int [n+1];
		for(int i = 0; i<n+1; i++) {
			int child = i + i%10 + i/10%10 + i/100%10 + i/1000%10 + i/10000;
			if(child>n) continue;
			nConstructor[child]++;
		}
		for(int i = 0; i<n; i++) {
			if(nConstructor[i] == 0) {
				System.out.println(i);
			}
		}
	}
}
