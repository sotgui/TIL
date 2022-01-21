### JAVA 정렬

* Arrays.sort() 

  * dual-pivot Quicksort 알고리즘 사용.
  * 평균 시간복잡도 : *O(nlogn)*
  * 최악의 경우 시간복잡도 : O(n^2)

* Collections.sort()

  - Timsort (합병 및 삽입정렬) : hybrid sorting algorithm

  * Merge Sort (합병 정렬) : 최선, 최악 모두 *O(nlogn)*  /  안정 정렬(stable sort)
  * Insertion Sort (삽입 정렬) : 최선의 경우 O(n), 최악의 경우 O(n^2)  /  안정 정렬(stable sort)
  * 시간복잡도 : O(n) ~ O(nlogn) 보장
  * List 계열 자료구조 사용해야함 (ArrayList, LinkedList 등)



++ Counting Sort (계수 정렬 / 카운팅 정렬)

 - 시간복잡도 : O(n)
 - https://st-lab.tistory.com/104?category=856997 참고.
 - 수열의 길이보다 수의 범위가 극단적으로 크면 메모리 낭비 극심해짐.