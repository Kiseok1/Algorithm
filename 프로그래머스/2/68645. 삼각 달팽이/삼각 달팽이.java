class Solution {	
	
	int[][] board;
	public int[] solution(int n) {
		int max = n*(n+1)/2;
		int[] answer = new int[max];
		board = new int[n][n];
		triangle(1,0,n-1,max,0,0);
		
		int check = 0;
		for(int i=0;i<board[0].length;i++) {
			for(int j=0;j<board.length;j++) {
				if(board[i][j]!=0) {
					answer[check] = board[i][j];
					check++;
				}
			}
		}
        return answer;
    }
	
	
	public void triangle(int start, int s, int e, int max, int depth, int breadth) {
		if(start>max || s>e) return;
		if(s==e) {
			board[depth][breadth] = start;
			return;
		}
		for(int i=s;i<e;i++) {
			board[depth][breadth] = start;
			start++;
			depth++;
			if(start>max) return;
		}
		for(int i=s;i<e;i++) {
			board[depth][breadth] = start;
			start++;
			breadth++;
			if(start>max) return;
		}
		for(int i=s;i<e;i++) {
			board[depth][breadth] = start;
			start++;
			depth--;
			breadth--;
			if(start>max) return;
		}
		depth=depth+2;
		breadth++;
		s=depth;
		e--;
		
		triangle(start,s,e,max,depth,breadth);
		
	}
}