import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			a.add(arr[i]);
		}
		int min = a.get(0);
		int chk = 0;
		for(int i=0;i<a.size();i++) {
			if(a.get(i)<min) {
				min = a.get(i);
				chk = i;
			}
		}
		a.remove(chk);
		
		if(a.size()==0) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[a.size()];
			for(int i=0;i<a.size();i++) {
				answer[i] = a.get(i);
			}
		}
		
		
        return answer ;
    }
}