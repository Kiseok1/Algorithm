import java.util.*;
class Solution {
    ArrayList<String> list = new ArrayList<>();
	ArrayList<String> list2 = new ArrayList<>();
	public int[] solution(String msg) {
        list.add("0");
        for(int i=0;i<26;i++) {
        	list.add((char)(65+i)+"");
        }
        
        lzw(msg,0,0);
        int[] answer = new int[list2.size()];
        for(int i=0;i<list2.size();i++) {
        	for(int j=0;j<list.size();j++) {
        		if(list2.get(i).equals(list.get(j))) {
        			answer[i] = j;
        			break;
        		}
        	}
        }
        
        return answer;
    }

	public void lzw(String msg, int start, int end) {
		if(end==msg.length()) {
			list2.add(msg.substring(start,end));
			return;
		}
		String temp = msg.substring(start, end+1);
		
		
		int check = 0;
		for(int i=list.size()-1;i>0;i--) {
			if(temp.equals(list.get(i))) {
				check=i;
				end = end+1;			
			} 
		}			
		
		if(check!=0) {		
			lzw(msg,start,end);		
		} else {
			list.add(msg.substring(start, end+1));
			
			list2.add(msg.substring(start,end));
			start = start+temp.length()-1;
			check=0;
			lzw(msg,start,end);
		}
	}
}