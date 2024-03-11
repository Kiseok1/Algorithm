class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        long dd = (long)d*d;
        for (int x=0;x<=d;x=x+k){
            long xx = (long)x*x;
            int y = (int)Math.sqrt(dd-xx);
            answer += Math.ceil(y/k)+1;
           
        }
        
        return answer;
    }
}