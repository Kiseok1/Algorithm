import java.util.*;
class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        int[][] book_time_int = new int[book_time.length][2];
        
        for(int i=0;i<book_time.length;i++) {
        	for(int j=0;j<book_time[i].length;j++) {
        		book_time_int[i][j] = Integer.parseInt(book_time[i][j].substring(0,2))*60+Integer.parseInt(book_time[i][j].substring(3));
        		if(j==1) {
        			book_time_int[i][j] += 10;
        		}
        	}
        }

        int[] rooms = new int[60*24+10];
        
        for(int[] b : book_time_int) {
        	for(int i=b[0];i<b[1];i++) {
        		rooms[i]++;
        		answer = Math.max(answer, rooms[i]);
        	}
        }
       
        return answer;
    }
}