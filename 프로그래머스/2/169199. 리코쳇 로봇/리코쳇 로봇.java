import java.util.*;
class Solution {
	int[] dy = {-1,1,0,0};
	int[] dx = {0,0,-1,1};
	boolean[][] visited;
	public int solution(String[] board) {
        int answer = 0;
        int fromX = 0;
        int fromY = 0;
        int toX = 0;
        int toY = 0;
        String[][] matrix = new String[board.length+2][board[0].length()+2];       
        for(int i=0;i<matrix.length;i++) {
        	Arrays.fill(matrix[i], "x");
        }
        for(int i=0;i<board.length;i++) {
        	board[i] = board[i].replaceAll("D", "x");
        	for(int j=0;j<board[i].length();j++) {
        		if(board[i].charAt(j)=='R') {
        			fromY=i+1;
        			fromX=j+1;
        		} else if(board[i].charAt(j)=='G') {
        			toY=i+1;
        			toX=j+1;
        		}
        		matrix[i+1][j+1] = board[i].charAt(j)+"";
        	}       	
        	
        }
        
        visited = new boolean[matrix.length][matrix[0].length];
        
        answer = move(fromY,fromX,toY,toX,matrix);
                
        return answer;
    }
	public int move(int fromY, int fromX, int toY, int toX, String[][] matrix) {
		Queue<int[]> que = new LinkedList<>();
		
		que.add(new int[] {fromY,fromX,0});
		visited[fromY][fromX] = true;
		
		while(!que.isEmpty()) {
			int[] loc = que.poll();
			int cnt = loc[2];
			
			if(loc[0]==toY && loc[1]==toX) {
				return cnt;
			}
			
			for(int i=0;i<4;i++) {
				int d=i;
				int y = loc[0];
				int x = loc[1];
				
				while(true) {
					int ny = y + dy[d];
					int nx = x + dx[d];
					if(matrix[ny][nx].equals("x")) {
						ny -= dy[d];
						nx -= dx[d];
						break;
					}
					y= ny;
					x= nx;
				}
				
				if(y==loc[0]&&x==loc[1]) continue;
				if(visited[y][x]) continue;
				else {
					que.add(new int[] {y,x,cnt+1});
					visited[y][x] =true;
				}
			}
		}

		return -1;
	}

	
}