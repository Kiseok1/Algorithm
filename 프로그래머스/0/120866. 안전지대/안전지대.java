class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        for(int i=0;i<board.length;i++) {
        	for(int j=0;j<board[i].length;j++) {
        		if(board[i][j]==1) {
                    if(board.length==1) {
        				if(board[0][0]==0) answer=1;
        				break;
        			}
        			if(i==0) {
        				if(j==0) {
        					if(board[i][j+1]==0) board[i][j+1]=2;        					
        					if(board[i+1][j]==0) board[i+1][j]=2;        					
        					if(board[i+1][j+1]==0) board[i+1][j+1]=2;
        				} else if(j==board[i].length-1){
        					if(board[i][j-1]==0) board[i][j-1]=2;        					
        					if(board[i+1][j]==0) board[i+1][j]=2;        					
        					if(board[i+1][j-1]==0) board[i+1][j-1]=2;
        				} else {
        					if(board[i][j-1]==0) board[i][j-1]=2;
        					if(board[i][j+1]==0) board[i][j+1]=2;        					
        					if(board[i+1][j-1]==0) board[i+1][j-1]=2;        					
        					if(board[i+1][j]==0) board[i+1][j]=2;        					
        					if(board[i+1][j+1]==0) board[i+1][j+1]=2;
        				}
        			} else if(i==board.length-1) {
        				if(j==0) {
        					if(board[i-1][j+1]==0) board[i-1][j+1]=2;        					
        					if(board[i-1][j]==0) board[i-1][j]=2;        					
        					if(board[i][j+1]==0) board[i][j+1]=2;
        				} else if(j==board[i].length-1){
        					if(board[i-1][j-1]==0) board[i-1][j-1]=2;
        					if(board[i-1][j]==0) board[i-1][j]=2;        					
        					if(board[i][j-1]==0) board[i][j-1]=2;        					
        				} else {
        					if(board[i-1][j-1]==0) board[i-1][j-1]=2;        					
        					if(board[i-1][j]==0) board[i-1][j]=2;        					
        					if(board[i-1][j+1]==0) board[i-1][j+1]=2;
        					if(board[i][j-1]==0) board[i][j-1]=2;
        					if(board[i][j+1]==0) board[i][j+1]=2;        					
        				}
        			} else if(j==0) {
        				if(board[i-1][j]==0) board[i-1][j]=2;
        				if(board[i-1][j+1]==0) board[i-1][j+1]=2;
    					if(board[i][j+1]==0) board[i][j+1]=2;        					
    					if(board[i+1][j]==0) board[i+1][j]=2;
    					if(board[i+1][j+1]==0) board[i+1][j+1]=2;
        			} else if(j==board[i].length-1) {
        				if(board[i-1][j]==0) board[i-1][j]=2;
        				if(board[i-1][j-1]==0) board[i-1][j-1]=2;
    					if(board[i][j-1]==0) board[i][j-1]=2;        					
    					if(board[i+1][j]==0) board[i+1][j]=2;
    					if(board[i+1][j-1]==0) board[i+1][j-1]=2;
        			} else {
        				if(i!=0 && i!=board.length-1) {
        					if(j!=0 && j!=board[i].length-1) {
        						if(board[i-1][j-1]==0) board[i-1][j-1]=2;
        						if(board[i-1][j]==0) board[i-1][j]=2;
        						if(board[i-1][j+1]==0) board[i-1][j+1]=2;
        						if(board[i][j-1]==0) board[i][j-1]=2;
        						if(board[i][j+1]==0) board[i][j+1]=2;        					
        						if(board[i+1][j-1]==0) board[i+1][j-1]=2;        					
        						if(board[i+1][j]==0) board[i+1][j]=2;        					
        						if(board[i+1][j+1]==0) board[i+1][j+1]=2;        					
        					}
        				}
        			}
        		}
        		//System.out.print(board[i][j]);
        	}
        	
        }
        for(int i=0;i<board.length;i++) {
        	for(int j=0;j<board[i].length;j++) {
        		if(board[i][j]==0) {
        			answer++;
        		}
        	}
        }	
        
        return answer;
    }
}