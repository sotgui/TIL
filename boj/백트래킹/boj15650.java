import java.util.*;
public class Main
{    // Ž�� ������ �߰�
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
	    dfs(0,0);
	}
	static void dfs(int start, int depth){
	    if(depth == m){         // ���̰� m�� �������� ����ϰ� return
	        for(int val : arr){
	            System.out.print(val + " ");
	        }
	        System.out.println();
	        return;
	    }
	    for(int i = start; i<n; i++){    // Ž�� ������(start)���� Ž��
	        if(checked[i] == false){
	            checked[i] = true;      // i�� �湮����
	            if(depth != 0){
	                
	            }
	            arr[depth] = i + 1;     // �迭�� depth��° �� = i+1
	            dfs(i, depth+1);           // ���� depth Ž�� (i���͸� Ž��)
	            checked[i] = false;     // �ڽĳ�带 �湮�ϰ� �������� �ٽ� �湮���� ���·� ��������� ��!!
	        }
	    }
	}
}