import java.util.*;
class Solution {
	int[] answer = new int[2];
    public int[] solution(int[][] users, int[] emoticons) {
       
        int[][] discount = new int[emoticons.length][4];
        for(int i=0;i<emoticons.length;i++) {
        	discount[i][0] = emoticons[i]*6/10;
        	discount[i][1] = emoticons[i]*7/10;
        	discount[i][2] = emoticons[i]*8/10;
        	discount[i][3] = emoticons[i]*9/10;
        }
        int[] sum = new int[users.length];
        dfs(discount,users,0,0,sum);
        return answer;
    }

	public void dfs(int[][] discount, int[][] users, int disNo, int disPercent, int[] sum) {
		if(disNo==discount.length) {
			int join = 0;
			int total = 0;
			for(int i=0;i<sum.length;i++) {
				if(sum[i]>=users[i][1]) {
					join++;
				} else {
					total += sum[i];
				}
			}
			if(answer[0]<=join) {
				if(answer[0]<join) answer[1]=0;
				answer[0] = join;
				answer[1] = Math.max(answer[1], total);										
			}
			return;
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<users.length;j++) {
				if(users[j][0]<=(4-i)*10) {
					sum[j] += discount[disNo][i];
				}
			}
			dfs(discount,users,disNo+1,i,sum);
			for(int j=0;j<users.length;j++) {
				if(users[j][0]<=(4-i)*10) {
					sum[j] -= discount[disNo][i];
				}
			}
		}
		
	}

	
}