import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
		int[] skip2 = new int[skip.length()];
		for(int i=0;i<skip.length();i++) {
			skip2[i]=skip.charAt(i);
		}
		Arrays.sort(skip2);
		int s2 = 0;
		
		for(int i=0;i<s.length();i++) {			
			s2 = s.charAt(i);
			for(int j=0;j<index;j++) {
				s2++;
				for(int k=0;k<skip2.length;k++) {
					if(skip2[k]==s2) s2++;
					if(s2==123) {
						s2 = 97; 
						k=-1;
					}
				}
			}
			answer += Character.toString(s2);
		}
        return answer;
    }
}