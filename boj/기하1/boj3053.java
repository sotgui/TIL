package boj;
import java.util.*;
public class boj3053 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi = 3.141593;
		double r = sc.nextInt();
		System.out.println(String.format("%.6f", r*r*Math.PI));
		System.out.println(String.format("%f", r*r*2));
	}
}
