class Solution {
    public int solution(String s) {
        int answer = 0;
		char ini = s.charAt(0);
		int check = 1;
		for(int i=1;i<s.length();i++) {
			if(ini==s.charAt(i)) {
				check++;
			} else {
				check--;
			}
			if(check==0 && i!=s.length()-1) {
				answer++;
				check=1;
				ini = s.charAt(i+1);
				i++;
			}
		}
		answer++;
        return answer;
    }
}