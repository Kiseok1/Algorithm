class Solution {
    public long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
        long start = 0;
        long end = 0;
        for(int i=0;i<t.length;i++) {
        	end = Math.max(end, (long)(a+b)*t[i]*2);
        }
        long answer = end;
        
        while(start<=end) {
        	
        	long mid = (start+end)/2;
        	int gold = 0;
        	int silver = 0;
        	int total = 0;
        	
        	for(int i=0;i<t.length;i++) {
        		long cnt = mid / (t[i] * 2);
        		if(mid%(t[i]*2)>=t[i]) cnt++;
        		
        		gold += Math.min(g[i], cnt * w[i]);
        		silver += Math.min(s[i], cnt * w[i]);
        		total += Math.min(g[i]+s[i], cnt * w[i]);
        	}
        	
        	if(gold>=a && silver>=b && total>=(a+b)) {
        		end = mid -1;
        		answer = Math.min(answer, mid);
        		continue;
        	}
        	
        	start = mid+1;
        }
        return answer;
    }
}