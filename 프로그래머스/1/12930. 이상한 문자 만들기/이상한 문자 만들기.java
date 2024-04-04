import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
		String[] temp = s.split(" ",-1);
		for(int i=0;i<temp.length;i++) {
			StringBuilder sb = new StringBuilder();
			temp[i] = temp[i].toLowerCase();
			for(int j=0;j<temp[i].length();j++) {
				if(j%2==0 && (temp[i].charAt(j)>=97 && temp[i].charAt(j)<=122)) {
					sb.append((char) (temp[i].charAt(j)-32));
				} else {
					sb.append((char) (temp[i].charAt(j)));
				}
				
			}
			temp[i] = sb.toString();
			
		}
		for(int i=0;i<temp.length;i++) {
			if(i==0) answer = temp[i];
			else answer += " "+temp[i];
		}
		
        return answer;
	
    }
}