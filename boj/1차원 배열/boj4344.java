package boj;
import java.util.*;
public class boj4344 {

	public static void main(String[] args) {
		// 평균은 넘겠지
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int c = sc.nextInt();	// 테스트케이스 개수
		for(int i = 0; i<c; i++) {
			double n = sc.nextInt();	// 학생 수 
			int[] score = new int[(int) n];
			double sum = 0;
			for(int j = 0; j<n; j++) {
				int s = sc.nextInt();
				sum += s;
				score[j] = s;
			}
			double avg = sum / n ;
			double count = 0;
			for(int j = 0; j<n; j++) {
				if(score[j] > avg) {
					count++;
				}
			}
			double ratio = count*100/n;
			sb.append(String.format("%.3f", ratio)).append("%\n");
		}
		System.out.println(sb);	
	}

}
