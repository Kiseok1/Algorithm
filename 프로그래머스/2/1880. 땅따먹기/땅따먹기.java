import java.util.*;
class Solution {
    int solution(int[][] land) {
    	int answer = 0;
    	int[] sum = new int[4];
    	
    	for(int i=0;i<4;i++) {
    		sum[i] = land[0][i];
    	}
    	
    	int first = 0;
    	int second = 0;
    	int temp = 0 ;
    	int idx = 0;
    	PriorityQueue<Integer> pq = new PriorityQueue<>();
    	
    	for(int i=1;i<land.length;i++) {
    		for(int j=0;j<4;j++) {
    			pq.add(sum[j]);
    			if(temp<=sum[j]) {
    				temp = sum[j];
    				idx = j;		
    			}
    		}
    		
    		pq.poll();
    		pq.poll();
    		second = pq.poll();
    		first = pq.poll();
    		
    		for(int j=0;j<4;j++) {
    			if(j!=idx) {
    				sum[j] = first+land[i][j];
    			} else {
    				sum[j] = second+land[i][j];
    			}   			
    		}	
    	}
    	for(int i : sum) {
    		answer = Integer.max(answer, i);
    	}
        return answer;
    }
}