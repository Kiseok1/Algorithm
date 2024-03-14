import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int length = score.length;
        Arrays.sort(score);
        //System.out.println(Arrays.toString(score));
        for(int i=length-m;i>=0;i=i-m) {
            //System.out.println(i);
            answer = answer + score[i]*m;
            //System.out.println(answer);
        }
        return answer;
    }
}