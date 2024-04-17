import java.util.*;
class Solution {
    ArrayList<int[]> list = new ArrayList<>();
	public int[][] solution(int n) {
		int[][] answer = new int[(int) Math.pow(2, n) - 1][2];
			
		hanoi(n, 1, 3, 2, 0 );
		for(int i=0;i<list.size();i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	}

	public void hanoi(int n, int source, int target, int k , int count) {
		if (n==1) {
			list.add(new int[] {source,target});
			return;
		}
		
		hanoi( n - 1, source, k, target, count+1);
		
		list.add(new int[] {source,target});
		
		hanoi( n - 1, k, target, source, count+1);
	}
}