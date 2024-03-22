class Solution {
    public int solution(int n) {
        int answer = 0;
		int check = 0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					check++;
				}
			}
			if(check>=3) {
				answer++;
			}
			check=0;
		}
        return answer;
    }
}