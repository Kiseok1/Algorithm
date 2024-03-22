import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
		int max = nums.length/2;
		Set<Integer> s = new HashSet<Integer>();
		for(int i : nums) {
			s.add(i);
		}
		if(s.size()>max) {
			answer = max;
		} else {
			answer=s.size();
		}
        return answer;
    }
}