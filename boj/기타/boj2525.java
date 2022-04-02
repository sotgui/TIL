package boj;
import java.util.*;
public class boj2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int min = sc.nextInt();
		int t = sc.nextInt();
		int tHour = 0;
		if(t >= 60) {
			tHour = t / 60;
			t %= 60;
		}
		int answerM = min + t;
		int answerH = h + tHour;
		if(answerM >= 60) {
			answerH += answerM / 60;
			answerM %= 60;
		}
		if(answerH >= 24) {
			answerH %= 24;
		}
		System.out.println(answerH + " " + answerM);		
	}
}
