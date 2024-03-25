class Solution {
    public long solution(long n) {
        long answer = 0;
        long temp =  (int) Math.ceil(Math.sqrt((double)n));
        if(temp*temp==n) {
        	answer = (temp+1)*(temp+1);
        } else {
        	answer = -1;
        }
        return answer;
    }
}