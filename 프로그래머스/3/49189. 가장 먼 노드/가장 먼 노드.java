import java.util.*;
class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        boolean[] visited = new boolean[n+1];
        answer = bfs(1,edge,visited,0);
        
        return answer;
    }

	public int bfs(int node, int[][] edge, boolean[] visited, int depth) {
		visited[node] = true;
		int[] d = new int[edge.length+1];
		Queue<Integer> que = new LinkedList<>();
		que.add(node);
		while(!que.isEmpty()) {
			depth = d[que.peek()]+1;
			int n = que.poll();
			
			for(int i=0;i<edge.length;i++) {
				if(edge[i][0]==n && !visited[edge[i][1]]) {
					que.add(edge[i][1]);
					visited[edge[i][1]]= true;
					d[edge[i][1]]=depth;
				} else if(edge[i][1]==n && !visited[edge[i][0]]) {
					que.add(edge[i][0]);
					visited[edge[i][0]]= true;
					d[edge[i][0]]=depth;
				}
			}
			
		}
		int max = 0;
		int check = 0;
		for(int i=0;i<d.length;i++) {
			max = Math.max(max, d[i]);
		}
		for(int i=0;i<d.length;i++) {
			if(max==d[i]) check++;
		}
		
		return check;
		
	}
}