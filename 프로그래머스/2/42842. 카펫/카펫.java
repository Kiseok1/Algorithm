class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int max = brown+yellow;
        int a = (brown/2)+2;
        int b = 0;
        for(int i=(int)Math.ceil(a/2);i<a-2;i++) {
        	b = a-i;
        	
        	
        	if(i*b==max) {
        		answer[0] = i;
        		answer[1] = b;
        	}
        }
        return answer;
    }
}
