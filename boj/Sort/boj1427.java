package boj;
import java.util.*;
public class boj1427 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		while(n>0) {
			list.add(n%10);
			n /= 10;
		}
		Collections.sort(list);
		for(int i = list.size(); i>0; i--) {
			System.out.print(list.get(i-1));
		}
	}
}
