class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=0;i<=n;i++) {
        	int t = 0;
        	int c = i;
        	while(true) {
        		c++;
        		if(t==n) {
        			answer++;
        			t=0;
        			c=0;
        			break;
        		} else if(t>n) {
        			t=0;
        			c=0;
        			break;
        		}
        		t += c;
        	}
        }
        return answer;
    }
}