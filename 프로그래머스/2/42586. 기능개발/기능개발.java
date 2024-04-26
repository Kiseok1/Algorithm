import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] completeDay = new int[speeds.length];
        int check = 0;
        int day=0;
    	while(check!=speeds.length) {
    		for(int i=0;i<progresses.length;i++) {
    			if(progresses[i]<100) {
    				progresses[i]+=speeds[i];
    			} else if(completeDay[i]==0 && progresses[i]>=100){
    				check++;
    				completeDay[i] = day;
    			}
    		}
    		day++;
    	}
    	Queue<Integer> q = new LinkedList<>();
    	q.add(completeDay[0]);
    	for(int i=1;i<completeDay.length;i++) {
    		if(completeDay[i]<completeDay[i-1]) {
    			completeDay[i] = completeDay[i-1];
    		}
    		q.add(completeDay[i]);
    	}
    	System.out.println(q);
    	ArrayList<Integer> list = new ArrayList<>();
    	int cnt =1;
    	while(true) {
    		int temp = q.poll();
    		if(q.isEmpty()) {
    			list.add(cnt);
    			break;
    		}
    		if(temp!=q.peek()) {
    			list.add(cnt);
    			cnt=1;
    		} else {
    			cnt++;
    		}
    	}
    	
    	int[] answer = new int[list.size()];
    	for(int i=0;i<list.size();i++) {
    		answer[i] = list.get(i);
    	}
        return answer;
    }
}