class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
		long temp = 0;
		for(long i=n;i>=a;) {
			answer += n / a *b;
			n = n%a + n/a*b;
			i=n;
		}
		
        return answer;
    }
}