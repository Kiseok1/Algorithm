import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<String> q = new LinkedList<>();
        for(int i=0;i<priorities.length;i++) {
        	q.add(i+","+priorities[i]);
        }
        while(!q.isEmpty()) {
        	String temp = q.poll();
        	for(int i=0;i<priorities.length;i++) {
        		if(Integer.parseInt(temp.substring(temp.length()-1))<priorities[i]) {
        			q.add(temp);
        			temp="";
        			break;
        		}
        	}
        	if(temp!="") {
        		answer++;
        		if(Integer.parseInt(temp.substring(0,(temp.indexOf(","))))==location) {
        			return answer;
        		}
        		priorities[Integer.parseInt(temp.substring(0,(temp.indexOf(","))))] = 0;
        	}
        }
        return answer;
    }
}