class Solution {
    public int solution(int num2) {
        int answer = 0;
		long num = (long)num2;
		while(true) {     
			
			if(num==1) {
				break;
			} else if(answer>500){
				answer =-1;
				break;
			}
            
            if(num%2==0) {
				num = num /2;
				answer ++;
			} else {
				num = (num*3) + 1;
				answer++;
			}
			
		}
        return answer;
    }
}