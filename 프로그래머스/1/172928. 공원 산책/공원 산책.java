import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
		String[][] map = new String[park.length][park[0].length()];
		int[] here = new int[2];
		int width = park[0].length()-1;
		int height = park.length-1;
		
		
		//map& 현위치 표시
		for(int i=0;i<park.length;i++) {
			for(int j=0;j<park[i].length();j++) {
				if(park[i].charAt(j)=='S') {
					map[i][j] = "S";
					here[0] = i;
					here[1] = j;
				} else if(park[i].charAt(j)=='X') {
					map[i][j] = "X";
				} else {
					map[i][j] = "O";
				}
			}
			//System.out.println(Arrays.toString(map[i]));
		}
		//System.out.println("here : " +here[0]+","+here[1]);
		
		for(int i=0;i<routes.length;i++) {
			String[] move = routes[i].split(" "); // 이동 표시
			//System.out.println(move[0]);
			//System.out.println(move[1]);
			
			switch(move[0]) {
			case "E" :
				if(here[1]+Integer.parseInt(move[1])>width) {
					break;
				}
				for(int j=here[1];j<=here[1]+Integer.parseInt(move[1]);j++) {
					if(map[here[0]][j].equals("X")) {
						here[1] = here[1]-Integer.parseInt(move[1]);
						break;
					}
				}
				here[1] = here[1]+Integer.parseInt(move[1]);
				//System.out.println("here : " +here[0]+","+here[1]);
				break;
			case "W" :
				if(here[1]-Integer.parseInt(move[1])<0) {
					break;
				}
				for(int j=here[1];j>=here[1]-Integer.parseInt(move[1]);j--) {
					if(map[here[0]][j].equals("X")) {
						here[1] = here[1]+Integer.parseInt(move[1]);
						break;
					}
				}
				here[1] = here[1]-Integer.parseInt(move[1]);
				//System.out.println("here : " +here[0]+","+here[1]);
				break;
			case "S" :
				if(here[0]+Integer.parseInt(move[1])>height) {
					break;
				}
				for(int j=here[0];j<=here[0]+Integer.parseInt(move[1]);j++) {
					if(map[j][here[1]].equals("X")) {
						here[0] = here[0]-Integer.parseInt(move[1]);
						break;
					}
				}
				here[0] = here[0]+Integer.parseInt(move[1]);
				//System.out.println("here : " +here[0]+","+here[1]);
				break;
			case "N" :
				if(here[0]-Integer.parseInt(move[1])<0) {
					break;
				}
				for(int j=here[0];j>=here[0]-Integer.parseInt(move[1]);j--) {
					if(map[j][here[1]].equals("X")) {
						here[0] = here[0]+Integer.parseInt(move[1]);
						break;
					}
				}
				here[0] = here[0]-Integer.parseInt(move[1]);
				//System.out.println("here : " +here[0]+","+here[1]);
				break;
				
			}//switch
		}
		
        return here;
    }
}