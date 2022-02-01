import java.util.*;
public class Main
{
    static int n;
    static int m;
    static int[] arr;
    static StringBuilder sb;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    m = sc.nextInt();
	    arr = new int[m];
	    sb = new StringBuilder();
	    dfs(0);
	    System.out.println(sb);
	}
	static void dfs(int depth){
	    if(depth == m){
	        for(int val : arr){
	            sb.append(val + " ");
	        }
	        sb.append("\n");
	        return;
	    }
	    for(int i = 0; i<n; i++){
            arr[depth] = i+1;
            dfs(depth + 1);
	    }
	}
}