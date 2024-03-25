class Solution {
    public String solution(String s, int n) {
        String answer = "";
		int temp = 0;
		for(int i=0;i<s.length();i++) {
			temp = s.charAt(i)+n;
			if(s.charAt(i)>=97 && s.charAt(i)<=122 && temp>122) {
				answer = answer + (char)(temp-26);
			} else if(s.charAt(i)>=97 && s.charAt(i)<=122 && temp<=122) {
				answer = answer + (char)temp;
			} else if(s.charAt(i)>=65 && s.charAt(i)<=90 && temp>90) {
				answer = answer + (char)(temp-26);
			} else if(s.charAt(i)>=65 && s.charAt(i)<=90 && temp<=90) {
				answer = answer + (char)temp;
			} else {
				answer = answer + " ";
			}
		}
        return answer;
    }
}