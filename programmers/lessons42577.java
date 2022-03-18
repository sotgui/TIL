import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i = 0; i<phone_book.length-1; i++){
            String pi = phone_book[i];
            String pj = phone_book[i+1];
            if(pi.length() < pj.length()){
                if(pi.equals(pj.substring(0,pi.length()))){
                    answer = false;
                    return answer;
                }
            }
        }
        return answer;
    }
}