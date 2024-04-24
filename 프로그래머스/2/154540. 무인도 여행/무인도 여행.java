import java.util.*;
class Solution {
	int sum;
	public int[] solution(String[] maps) {
        
        int[][] map = new int[maps.length+2][maps[0].length()+2];
        
        for(int i=0;i<maps.length;i++) {
        	maps[i] = maps[i].replace("X", "0");
        	for(int j=0;j<maps[i].length();j++) {
        		map[i+1][j+1] = Integer.parseInt(maps[i].charAt(j)+"");
        	}
        }
        
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for(int i=1;i<map.length;i++) {
        	for(int j=1;j<map[i].length;j++) {
        		if(map[i][j]!=0) {
        			sum=0;
        			sum += map[i][j];     			
        			map[i][j] = 0;
        			visit(i+1,j,map);
        			visit(i,j+1,map);
                    visit(i-1,j,map);
        			visit(i,j-1,map);
        			que.add(sum);
        		}
        	}
        }
        
        
        int size = que.size();
        int[] answer = new int[size];
        for(int i=0;i<size;i++) {
        	answer[i] = que.poll();
        }
        if(size==0) {
        	answer = new int[1];
        	answer[0] = -1;
        }
        return answer;
    }
	
	public void visit(int i, int j, int[][] map) {
		if(map[i][j]!=0) {
			sum += map[i][j];		
			map[i][j] = 0;
			visit(i+1,j,map);
			visit(i,j+1,map);
            visit(i-1,j,map);
        	visit(i,j-1,map);
		}
		
	}
}