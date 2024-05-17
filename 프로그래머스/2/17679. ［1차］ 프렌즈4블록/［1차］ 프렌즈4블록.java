import java.util.*;
class Solution {
	public int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] boards = new char[m][n];
        for(int i=0;i<board.length;i++) {
        	boards[i] = board[i].toCharArray();
        }
        
        re(boards,m,n);
        
        for(int i=0;i<boards.length;i++) {
        	for(int j=0;j<boards[i].length;j++) {
        		if(boards[i][j]=='0') answer++;
        	}
        }
        return answer;
    }

	public void re(char[][] boards, int m, int n) {
		
	 	Set<int[]> set = new HashSet<>();
	 	int check1 = 1;
	 	int check2 = 0;
        for(int i=0;i<m-1;i++) {
        	for(int j=0;j<n-1;j++) {
        		if(boards[i][j] == boards[i][j+1] && boards[i][j] == boards[i+1][j] && boards[i][j] == boards[i+1][j+1]) {
        			set.add(new int[]{i,j});
        			set.add(new int[]{i,j+1});
        			set.add(new int[]{i+1,j});
        			set.add(new int[]{i+1,j+1});
        		}
        	}
        }
        for(int[] i : set) {
        	int y= i[0];
        	int x= i[1];
        	boards[y][x] = '0';
        }
        
        while(check1==1) {
        	check1=0;
        	for(int i=0;i<m-1;i++) {
        		for(int j=0;j<n;j++) {
        			if(boards[i][j]!='0' && boards[i+1][j] == '0') {
        				boards[i+1][j] = boards[i][j];
        				boards[i][j] = '0';
        				check1=1;
        				check2=1;
        			} 
        		}
        	}
        }
        
		if(check2==1) {
			re(boards,m,n);
		}
	}
}