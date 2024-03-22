import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				//System.out.println(i+","+j);
				temp.add(numbers[i]+numbers[j]);
			}
		}
		Collections.sort(temp);
		//System.out.println(temp.toString());
		ArrayList<Integer> ans = (ArrayList<Integer>) temp.stream().distinct().collect(Collectors.toList());
		int[] answer = new int[ans.size()];
		for(int i=0;i<ans.size();i++) {
			answer[i]=ans.get(i);
		}
        return answer;
    }
}