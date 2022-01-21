package boj;
import java.io.*;
public class boj10989 {

	public static void main(String[] args) throws IOException {
		// 카운팅 정렬
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] count = new int[10001];
		int max = 0;
		for(int i = 0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			count[num]++;
			max = Math.max(max, num);
		}
		for(int i = 0; i<=max; i++) {
			while(count[i]>0) {
				sb.append(i).append("\n");
				count[i]--;
			}
		}
		System.out.println(sb);
	}

}
