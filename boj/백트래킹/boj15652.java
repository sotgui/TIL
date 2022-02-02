import java.util.*;
public class Main
{
    static int n;
    static int m;
    static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m];
		dfs(0,0);
	}
	static void dfs(int start, int depth){
	    if(depth == m){
	        for(int val : arr){
	            System.out.print(val + " ");
	        }
	        System.out.println();
	        return;
	    }
	    for(int i = start; i<n; i++){
            arr[depth] = i + 1;
            dfs(i, depth + 1);
	    }
	}
}