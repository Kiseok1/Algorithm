import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
		double[][] temp = new double[N+1][3];
		for(int i=0;i<N+1;i++) {
			temp[i][0] = i+1;
			
		}
		int user = stages.length;
		int count = 1;
		int check = 1;
		Arrays.sort(stages);
		for(int i=0;i<stages.length;i++) {
			temp[stages[i]-1][1]++;
		}
		for(int i=0;i<N;i++) {
			temp[i][2]=temp[i][1]/user;
			
			user = (int) (user - temp[i][1]);
            if(user == 0) break;
		}
		
		Arrays.sort(temp, Comparator.comparingDouble((double[] o) -> o[2]).reversed());
		for(int i=0;i<N;i++) {
			
			answer[i] = (int) temp[i][0];
		}
        return answer;
    }
}