import java.util.*;
class Solution {	
	
	public int solution(int n, int s, int a, int b, int[][] fares) {
        int answer = Integer.MAX_VALUE;
        int[][] min = new int[n+1][n+1];
        
        int inf = 20000000;
        for(int i=0;i<n+1;i++) {
        	for(int j=0;j<n+1;j++) {
        		min[i][j] = inf;
        		if(i==j) min[i][j] =0;
        	}
        }
        for(int i=0;i<fares.length;i++) {
        	min[fares[i][0]][fares[i][1]] = fares[i][2];
        	min[fares[i][1]][fares[i][0]] = fares[i][2];
        }
        for(int k=1;k<n+1;k++) {
        	for(int i=1;i<n+1;i++) {
        		for(int j=1;j<n+1;j++) {
        			min[i][j] = Math.min(min[i][j], min[i][k]+min[k][j]);
        		}
        	}
        	
        }
        answer = (min[s][a]+min[s][b]);
        for(int k=1;k<n+1;k++) {
        	answer = Math.min(answer, min[s][k] + min[k][a] +min[k][b]);
        }
        
        
        return answer;
    }
}