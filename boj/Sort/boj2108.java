package boj;
import java.util.*;
public class boj2108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		int[] count = new int[8001];	// 1~3999:음수, 4000~8000:양수
		double sum = 0;
		for(int i = 0; i<n; i++) {
			int num = sc.nextInt();
			count[num+4000]++;
			sum += num;
		}
		int j = 0;
		ArrayList<Integer> freq = new ArrayList<Integer>();	// 최빈값
		int freqC = 1;	// 역대 최빈 개수
		for(int i = 0; i<8001; i++) {
			// 최빈값도 여기서 찾아야함
			if(count[i] > freqC) {
				freqC = count[i];
				freq.clear();
				freq.add(i-4000);
			}else if(count[i] == freqC) {
				freq.add(i-4000);
			}
			while(count[i]>0) {
				nums[j] = i-4000;
				count[i]--;
				j++;
			}
		}
		System.out.println(Math.round(sum/n));	// 1. 산술평균
		System.out.println(nums[n/2]);	// 2. 중앙값
		if(freq.size() == 1) {				// 3. 최빈값
			System.out.println(freq.get(0));
		}else {
			System.out.println(freq.get(1));
		}
		System.out.println(nums[n-1] - nums[0]);
		
		
	}

}
