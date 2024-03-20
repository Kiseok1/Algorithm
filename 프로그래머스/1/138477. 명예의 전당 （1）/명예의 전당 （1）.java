import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
		int check = 0;
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i=0;i<score.length;i++) {
			temp.add(i,score[i]);
			Collections.sort(temp,Collections.reverseOrder());
			if(i<k-1) {
				answer[i] = temp.get(i);
			} else {
				answer[i] = temp.get(k-1);
			}
		}
        return answer;
    }
}