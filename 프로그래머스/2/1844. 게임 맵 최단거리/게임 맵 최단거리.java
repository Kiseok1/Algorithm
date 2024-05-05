import java.util.*;
class Solution {
	int[] arrX = {0,1,0,-1};
	int[] arrY = {1,0,-1,0};
	boolean[][] visited;
	int answer;
    public int solution(int[][] maps) {
        answer = 0;
        visited = new boolean[maps.length][maps[0].length];
        bfs(0,0,maps);
        if(answer==0) answer=-1;
        return answer;
    }
	public void bfs(int y, int x, int[][] maps) {
		Queue<int[]> q = new LinkedList<>();
		
		q.add(new int[]{y,x,1});
		visited[y][x] = true;
		
		while(!q.isEmpty()) {
			int temp[] = q.poll();
			y=temp[0];
			x=temp[1];
			int count = temp[2];
			if(y==maps.length-1 && x==maps[0].length-1) {
				answer = count;
				return;
			}
			
			for(int i=0;i<4;i++) {
				if(y+arrY[i]<0 || x+arrX[i]<0 || y+arrY[i]>maps.length-1 || x+arrX[i]>maps[0].length-1) continue;
				if(maps[y+arrY[i]][x+arrX[i]]==0) continue;
				if(maps[y+arrY[i]][x+arrX[i]]==1 && !visited[y+arrY[i]][x+arrX[i]]) {
					visited[y+arrY[i]][x+arrX[i]]=true;
					q.add(new int[] {y+arrY[i],x+arrX[i],count+1});
				} 
			}
		}
	}
}