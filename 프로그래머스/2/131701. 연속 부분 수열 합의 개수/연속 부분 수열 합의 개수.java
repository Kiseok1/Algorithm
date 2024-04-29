import java.util.*;
class Solution {
    public int solution(int[] elements) {
    	HashSet<Integer> hs = new HashSet<>();
        int answer = 0;
        int length = 1;
        for(int i=0;i<elements.length;i++) {
        	int a=0;
        	for(int j=i;j<elements.length+i;j++) {
        		a += elements[j%elements.length];
        		hs.add(a);
        	}
        }
        answer = hs.size();
        return answer;
    }
}