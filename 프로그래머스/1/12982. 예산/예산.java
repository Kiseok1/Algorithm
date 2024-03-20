import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        //System.out.print(Arrays.toString(d));
        for(int i=0;i<d.length;i++){
            if(budget>=0) {
                budget -= d[i];
                answer++;
            } else {                              
                break;
            }
        }
        if(budget<0){
            answer = answer -1;
        }
        return answer;
    }
}