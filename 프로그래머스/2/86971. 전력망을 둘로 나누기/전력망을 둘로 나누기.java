import java.util.*;
class Solution {	
	
	public int solution(int n, int[][] wires) {
        int answer = n;
        int[][] matrix = new int[n+1][n+1];
        for(int i=0;i<matrix.length;i++) {
        	matrix[i][0] = i;
        	matrix[0][i] = i;
        }
        for(int i=0;i<wires.length;i++) {
        	matrix[wires[i][0]][wires[i][1]] = 1;
        	matrix[wires[i][1]][wires[i][0]] = 1;
        }

        for(int i=0;i<wires.length;i++) {
        	boolean[] check = new boolean[n+1];
        	check[wires[i][0]] = true;
        	check[wires[i][1]] = true;
        	for(int j=0;j<matrix[0].length-1;j++) {
        		if(matrix[wires[i][0]][j+1]==1 && check[j+1]==false) {		
        			check[j+1]=true;
        			visit(j+1,matrix,check,wires);
        		}
        	}
        	int a=0;
        	for(int j=0;j<check.length;j++) {
        		if(check[j]==true) {
        			a++;
        		}
        	}
        	a =a-1;
        	answer = Math.min(answer, Math.abs(n-(2*a)));
        }
        return answer;
    }

	public void visit(int i, int[][] matrix, boolean[] check, int[][] wires) {
		for(int j=0;j<matrix[0].length-1;j++) { 		
    		if(matrix[i][j+1]==1 && check[j+1]==false) {		
    			check[j+1]=true;
    			visit(j+1,matrix,check,wires);
    		}
    	}
	}

}