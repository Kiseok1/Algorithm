import java.util.Arrays;

class Solution {
    public String solution(String s) {
         String answer = "";
		 int length = s.length();
		 char[] temp = new char[length];
		 for(int i=0;i<length;i++) {
			 temp[i]=s.charAt(i);
		 }
		 Arrays.sort(temp);
		 for(int i=length-1;i>=0;i--) {
			 answer += temp[i];
		 }
		 
	     return answer;
    }
}