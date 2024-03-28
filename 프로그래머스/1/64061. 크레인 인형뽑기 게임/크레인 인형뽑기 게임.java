import java.util.ArrayList;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
		ArrayList<Integer> temp = new ArrayList<Integer>(); 
		for(int i=0;i<moves.length;i++) {
			for(int j=0;j<board.length;j++) {
				if(board[j][moves[i]-1]!=0) {
					temp.add(board[j][moves[i]-1]);
					board[j][moves[i]-1]=0;
					break;
				}
			}	
		}
		for(int i=1;i<temp.size();i++) {
			if(temp.get(i)==temp.get(i-1)) {
				System.out.println(temp);
				System.out.println("a : "+answer);
				System.out.println("i : "+i);
				answer = answer +2;
				temp.remove(i-1);
				temp.remove(i-1);
				i = i-2;
				if(i==-1) {
					i=0;
				}
			}
		}
        return answer;
    }
}