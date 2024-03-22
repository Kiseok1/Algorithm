import java.util.Arrays;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
		int[] x = new int[4];
		int[] y = new int[4];
		
		for(int i=0;i<dots.length;i++) {
			for(int j=0;j<dots[i].length;j++) {
				if(j==0) {
					x[i]=dots[i][j];
				} else {
					y[i]=dots[i][j];
				}
				
			}
		}
		
		Arrays.sort(x);
		Arrays.sort(y);
		answer = (x[3]-x[0]) * (y[3]-y[0]);
        return answer;
    }
}