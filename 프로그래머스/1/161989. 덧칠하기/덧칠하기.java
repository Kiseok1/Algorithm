import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		int check=0;
		while(stack.size()<section.length) {
			int paintStart = section[check];
			int paintEnd = paintStart+m-1;	
			
			for(int i=check;i<section.length;i++) {	
				if(section[i] >=paintStart && section[i] <=paintEnd) {
					stack.add(section[i]);
					check++;
				}
				
			}
			
			answer++;
		}
        return answer;
    }
}