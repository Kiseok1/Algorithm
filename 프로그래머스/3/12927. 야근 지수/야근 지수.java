import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
       
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : works) {
        	q.add(i);
        }
        
        for(int i=0;i<n;i++) {
        	int max = q.poll();
        	if(max<=0) {
        		break;
        	}
        	q.add(max-1);
        }
        
        for(int i=0;i<works.length;i++) {
        	if(q.peek()!=0) {
        		answer += Math.pow(q.poll(), 2);        		
        	}
        }
        return answer;
    }
}