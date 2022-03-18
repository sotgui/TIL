class Solution {
    public int solution(String s) {
        int l = s.length();
        int answer = l;
        for(int i = 1; i<=l/2; i++){   // i : 자르는 크기
            String result = "";             // 압축 완료한 문자열
            String str = s.substring(0, i); // 비교할 문자열 기준
            String nextStr = "";            // 비교대상
            int count = 1;
            for(int j = 1; j<l/i; j++){    // j : 자른 문자열의 인덱스
                nextStr = s.substring(j*i, (j+1)*i); // 비교대상 
                if(str.equals(nextStr)){
                    count++;
                }else {
                    if(count != 1){
                        result = result.concat(Integer.toString(count)).concat(str);
                    }else{
                        result = result.concat(str);
                    }
                    str = nextStr;
                    count = 1;
                }
            }
            if(count != 1){
                result = result.concat(Integer.toString(count)).concat(str);
            }else{
                result = result.concat(str);
            }
            if(l%i != 0) {
                result = result.concat(s.substring(i*(l/i) , l));
            }
            answer = Math.min(answer, result.length());
        }
        return answer;
    }
}