import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<operations.length;i++) {
        	if(operations[i].charAt(0)=='I') {
        		
        		list.add(Integer.parseInt(operations[i].substring(2)));
        	} else {
        		if(list.size()!=0) {
        			if(Integer.parseInt(operations[i].substring(2))==-1) {
        				list.remove(0);
        			} else {
        				list.remove(list.size()-1);
        			}
        		}
        	}
        	Collections.sort(list);
        	
        }
        if(list.size()>=2) {
        	answer[1] = list.get(0);
        	answer[0] = list.get(list.size()-1);
        } else if(list.size()==1) {
        	answer[0] = list.get(0);
        	answer[1] = list.get(0);
        }
        return answer;
    }
}