import java.util.*;
class Solution {
	int answer;
	
    public int solution(int n, int[][] computers) {
        answer = 1;
        bfs(0,n,computers);     
        
        return answer;
    }

	public void bfs(int k,int n,int[][] computers) {
		boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        visited[k] = true;
        q.add(k);
        while(true) {
        	int check = 0; 	
        	while(q.size()!=0) {
        		int now = q.poll();
        		for(int i=0;i<n;i++) {
        			if(visited[i]==false && computers[now][i]==1) {
        				q.add(i);
        				visited[i] = true;
        			}
        		}
        	}
        	
        	for(int i=0;i<n;i++) {
        		if(visited[i]==false) {
        			check = 1;
        			answer++;
        			q.add(i);
        			break;
        		}
        	}
        	
        	if(check==0) break;
        }		
	}
}