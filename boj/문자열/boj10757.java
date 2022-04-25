package boj;
import java.util.*;
public class boj10757 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		// 8자리씩 끊어서 더하기
		// 한자리 추가되는 경우 plus에 저장
		int aLen = a.length();
		int bLen = b.length();
		int plus = 0;
		String ans = "";
		int ka = aLen/8;
		int kb = bLen/8;
		int k = Math.max(ka, kb);
		String str1 = "";
		String str2 = "";
		for(int i = 0; i<=k; i++) {
			int num1 = 0;
			int num2 = 0;
			str1 = "";
			str2 = "";
			if(i == 0) {
				str1 = a.substring(ka*8);
				str2 = b.substring(kb*8);
			}else {
				if(ka-i >= 0) {
					str1 = a.substring((ka-i)*8, (ka-i+1)*8);
				}
				if(kb-i >= 0) {
					str2 = b.substring((kb-i)*8, (kb-i+1)*8);
				}
			}
			if(str1.equals("") && str2.equals("")) continue;
			if(!str1.equals("") && str1!=null) {
				num1 = Integer.parseInt(str1);
			}
			if(!str2.equals("") && str2!=null) {
				num2 = Integer.parseInt(str2);
			}
			int n = num1 + num2 + plus;
			String s = Integer.toString(n);
			if(s.length() > Math.max(str1.length(), str2.length())) {
				plus = 1;
			}else {
				plus = 0;
			}
			ans = Integer.toString(n).concat(ans);
		}
		
		System.out.println(ans);
	}
}
