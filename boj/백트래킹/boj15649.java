import java.util.*;
public class Main
{
    static int n;
    static int m;
    static boolean[] checked;
    static int[] arr;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    m = sc.nextInt();
	    checked = new boolean[n];
	    arr = new int[m];
	    dfs(0);
	}
	static void dfs(int depth){
	    if(depth == m){         // 깊이가 m과 같아지면 출력하고 return
	        for(int val : arr){
	            System.out.print(val + " ");
	        }
	        System.out.println();
	        return;
	    }
	    for(int i = 0; i<n; i++){
	        if(checked[i] == false){
	            checked[i] = true;      // i를 방문했음
	            arr[depth] = i + 1;     // 배열의 depth번째 수 = i+1
	            dfs(depth+1);           // 다음 depth 탐색
	            checked[i] = false;     // 자식노드를 방문하고 나왔으면 다시 방문가능 상태로 설정해줘야 함!!
	        }
	    }
	}
}