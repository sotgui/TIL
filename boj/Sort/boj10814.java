package boj;
import java.util.*;
public class boj10814 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Member[] members = new Member[n];
		for(int i = 0; i<n; i++) {
			int age = sc.nextInt();
			String name = sc.next();
			members[i] = new Member(age, name, i);
		}
		Arrays.sort(members);
		for(int i = 0; i<n; i++) {
			System.out.println(members[i].age + " " + members[i].name);
		}
		
	}
	
	static class Member implements Comparable<Member> {
		int age;
		String name;
		int num;
		
		Member(int age, String name, int num) {
			this.age = age;
			this.name = name;
			this.num = num;
		}
		
		public int compareTo(Member mem) {
			if(this.age > mem.age) {
				return 1;
			}else if(this.age < mem.age) {
				return -1;
			}else if(this.num > mem.num) {
				return 1;
			}
			return 0;
		}
	}
}
