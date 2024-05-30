class Solution {
    public int[] solution(int n, int s) {
        int[] answer = {};
        int share = s/n;
        int remain = s%n;
        
        if(share==0) {
        	answer = new int[] {-1};
        } else {
        	answer = new int[n];
        	for(int i=n-1;i>=0;i--) {
        		answer[i] = share;
        	}      	
        	for(int i=0;i<remain;i++) {
        		answer[n-1-i]++;
        	}      	
        }
        return answer;
    }
}