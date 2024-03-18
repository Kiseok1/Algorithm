class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int check = 0;
        for(int i=left;i<=right;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){
                  check++;  
                }
            }
            if (check%2==0){
                answer = answer + i;
                check = 0;
            } else {
                answer = answer - i;
                check = 0;
            }
        }
        return answer;
    }
}