import java.util.*;
class Solution {
    public int solution(int n, int[][] road, int k) {
        int answer = 0;
        boolean[] visited = new boolean[n+1];
        int[] time = new int[n+1];
        Arrays.fill(time, 500000);
        time[1] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        
        while(!q.isEmpty()) {
        	int[][] temp = new int[q.size()][2];
        	int size = q.size();
        	for(int i=0;i<size;i++) {
        		temp[i][0] = q.poll();
        		temp[i][1] = time[temp[i][0]];
        	}
        	Arrays.sort(temp , new Comparator<int[]>() {
        		public int compare(int[] o1, int[] o2) {
        			return o1[1]-o2[1];
        		}
        	});
        	for(int i=0;i<size;i++) {
        		q.add(temp[i][0]);
        	}
        	int cur = q.poll();
        	
        	for(int i=0;i<road.length;i++) {
        		if(!visited[road[i][1]] && road[i][0]==cur) {
        			time[road[i][1]] = Math.min(time[road[i][1]], time[road[i][0]] + road[i][2]);
        			if(!q.contains(road[i][1])) {
        				q.add(road[i][1]);        				
        			}
        		} else if(!visited[road[i][0]] && road[i][1]==cur) {
        			time[road[i][0]] = Math.min(time[road[i][0]], time[road[i][1]] + road[i][2]);
        			if(!q.contains(road[i][0])) {
        				q.add(road[i][0]);        				
        			}
        		}
        	}
        	
        	visited[cur] = true;
 
        }
        for(int i=0;i<time.length;i++) {
        	if(time[i]<=k) answer++;
        }
        return answer;
    }
}