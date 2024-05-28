class Solution {
    int[] gInfo;
    int[][] gEdge;
    int answer = 0;
	
	public int solution(int[] info, int[][] edges) {
        boolean[] visited = new boolean[info.length];
        gInfo = info;
        gEdge = edges;
        dfs(0,visited,0,0);
        
        return answer;
    }

	public void dfs(int idx, boolean[] visited, int sheepCnt, int wolfCnt) {
		visited[idx] = true;
		
		if(gInfo[idx]==0) {
			sheepCnt++;
			if(answer<sheepCnt) {
				answer = sheepCnt;
			}
		} else {
			wolfCnt++;
		}
		
		if(sheepCnt <= wolfCnt) {
			return;
		}
		
		for(int[] edge : gEdge) {
			if(visited[edge[0]] && !visited[edge[1]]) {				
				boolean[] nextVisited = new boolean[gInfo.length];
				for(int i=0;i<nextVisited.length;i++) {
					nextVisited[i] = visited[i];
				}
				dfs(edge[1],nextVisited,sheepCnt,wolfCnt);
			}
		}
		
	}
}