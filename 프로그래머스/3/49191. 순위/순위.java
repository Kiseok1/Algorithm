import java.util.*;
class Solution {
    public int solution(int n, int[][] results) {
        int answer = 0;
        
        int[][] rank = new int[n+1][n+1];
        for(int i=0;i<rank.length;i++) {
        	rank[0][i] = i;
        	rank[i][0] = i;
        }
        for(int i=0;i<results.length;i++) {
        	rank[results[i][1]][results[i][0]] = -1;
        	rank[results[i][0]][results[i][1]] = 1;
        	
        }
        
        for(int i = 1 ; i <= n ; i ++) {
            for(int j = 1 ; j <= n ; j ++) {
                for(int k = 1 ; k <= n ; k ++) {
                   if(rank[j][k]==0) {
                	   if(rank[j][i]==1 && rank[i][k]==1) {
                		   rank[j][k]=1;
                	   } else if(rank[j][i]==-1 && rank[i][k]==-1) {
                		   rank[j][k] = -1;
                	   }
                   }
                }
            }
        }
        
        for(int i=1;i<rank.length;i++) {
        	int check = 0;
        	for(int j=1;j<rank.length;j++) {
        		if(rank[i][j]==0) {
        			check++;
        		}
        	}
        	if(check==1) {
        		answer++;
        	}
        }
        
        return answer;
    }
}