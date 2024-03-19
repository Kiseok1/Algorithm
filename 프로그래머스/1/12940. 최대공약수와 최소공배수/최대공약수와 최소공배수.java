import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				for(int j=1;j<=m;j++) {
					if(m%j==0) {
						if(i==j) {
							answer[0]=j;
						}
					}
				}
			}
		}
		
		loop:
		for(int i=n;i<=n*m;i=i+n) {
			for(int j=m;j<=n*m;j=j+m) {
				if(i==j) {
					answer[1]=j;
					break loop;
				}
			}
		}
		
        return answer;
    }
}