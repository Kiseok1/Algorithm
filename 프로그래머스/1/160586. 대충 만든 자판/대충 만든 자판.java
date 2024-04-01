import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
		HashMap<Character, Integer> key = new HashMap<Character, Integer>();
	
		for(String s : keymap ) {
			for (int i=0;i<s.length();i++) {
				if(key.get(s.charAt(i))==null || key.get(s.charAt(i))>i ) key.put(s.charAt(i), i+1);
			}
		}
		
		for(int i=0;i<targets.length;i++) {
			for(int j=0;j<targets[i].length();j++) {
				if(key.get(targets[i].charAt(j))!=null) {
					answer[i] += key.get(targets[i].charAt(j));
				} else {
					answer[i] = -1;
					break;
				}
			}
		}	
		
        return answer;
    }
}