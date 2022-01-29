import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] originX = new int[n];
		int[] sortedX = new int[n];
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i<n; i++){
		    originX[i] = sc.nextInt();
		    sortedX[i] = originX[i];
		}
		Arrays.sort(sortedX);
		map.put(sortedX[0], 0);
		int rank = 1;
		for(int i = 1; i<n; i++){
		    if(sortedX[i] != sortedX[i-1]){
    		    map.put(sortedX[i], rank);
    		    rank++;
		    }
		}
		StringBuilder sb = new StringBuilder();
		for(int i : originX){
		    sb.append(map.get(i)).append(" ");
		}
		System.out.println(sb);
	}
}
