package boj;
import java.util.*;
public class boj1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] result = str.split(" ");
		int count = 0;
		for(int i = 0; i<result.length; i++) {
			boolean flag = true;
			for(int j = 0; j<result.length; j++) {
				if(i == j) continue;
				if(result[i].equals(result[j])) {
					flag = false;
				}
			}
			if(flag) {
				count++;
			}
		}
		System.out.println(count);
	}
}
