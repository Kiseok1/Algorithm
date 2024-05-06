import java.util.*;
class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int n=0;
        int[][] matrix = new int[rows][columns];
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<columns;j++) {
        		matrix[i][j] = ++n;
        	}
        	
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<queries.length;i++) {
        	int y1 = queries[i][0]-1;
        	int x1 = queries[i][1]-1;
        	int y2 = queries[i][2]-1;
        	int x2 = queries[i][3]-1;
        	int cx = x1;
        	int cy = y1;
        	int temp = Integer.MAX_VALUE;
        	
        	while(true) {
        		
        		if(cx==x1 && cy==y1) q.add(matrix[cy][cx]);
        		temp = Math.min(temp, q.peek());
        		if(cx!=x2 && cy==y1) {
        			cx++;
        			q.add(matrix[cy][cx]);
        			matrix[cy][cx] = q.poll();
        		} else if(cx==x2 && cy!=y2) {
        			cy++;
        			q.add(matrix[cy][cx]);
        			matrix[cy][cx] = q.poll();
        		} else if(cx!=x1 && cy==y2) {
        			cx--;
        			q.add(matrix[cy][cx]);
        			matrix[cy][cx] = q.poll();
        		} else if(cx==x1 && cy!=y1) {
        			cy--;
        			q.add(matrix[cy][cx]);
        			matrix[cy][cx] = q.poll();
        		}
        		if(cx==x1 && cy==y1) {
        			q.clear();
        			answer[i] = temp;
        			temp=Integer.MAX_VALUE;
        			break;
        		}
        	}
        }
        return answer;
    }
}