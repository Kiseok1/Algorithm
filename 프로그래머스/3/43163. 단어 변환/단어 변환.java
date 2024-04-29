class Solution {
	int answer;
	int temp;
    public int solution(String begin, String target, String[] words) {
        answer = 0;
        for(int i=0;i<words.length;i++) {
        	if(words[i].equals(target)) {
        		answer ++;
        	}
        }
        if(answer!=0) {
        	temp = 0;
        	answer = Integer.MAX_VALUE;
        	dfs(begin,target,words,temp);  
            
        }
        return answer;
    }
    
	public void dfs(String begin, String target, String[] words, int temp) {
		if(begin.equals(target)) {
			answer = Math.min(answer, temp);
			return;
		}
		for(int i=0;i<words.length;i++) {
			int k=0;
			for(int j=0;j<begin.length();j++) {
				
				if(begin.charAt(j)==words[i].charAt(j)) {
					
					k++;
				}
			}
			if(k==begin.length()-1) {
				temp++;
				
				begin = words[i];
				words[i] = "00000000000";
				dfs(begin,target,words,temp);
			}
		}
	}
}