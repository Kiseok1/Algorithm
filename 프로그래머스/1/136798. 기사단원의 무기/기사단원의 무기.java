class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
		long[] temp = new long[number+1];
		for(int i=1;i<=number;i++) {
			for(int j=1;j*j<=i;j++) {
				if(j*j==i) temp[i]++;
				else if(i%j==0) temp[i]+=2;
			}
			if(temp[i]>limit) temp[i] = power;
			answer = answer + (int)temp[i];
		}
		
        return answer;
    }
}