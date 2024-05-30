import java.util.*;
class Solution {
    public String solution(int n, int t, int m, String[] timetable) {
        String answer = "";
        int hour = 9;
        int minute = 0;
        String[][] table = new String[n][m+1];
        Arrays.sort(timetable);
        List<String> list = new ArrayList<>();
        for(String s : timetable) {
        	list.add(s);
        }
        
        for(int i=0;i<n;i++) {
        	String time = "";
        	if(minute>=60) {
        		hour++;
        		minute -= 60;
        	}
        	if(hour<10) {
        		time = "0"+hour+":";
        	} else {
        		time = hour+":";
        	}
        	if(minute<10) {
        		time += "0"+minute;
        	} else {
        		time += minute;
        	}
        	table[i][0] = time; 
        	
        	for(int j=0;j<m;j++) {
        		if(!list.isEmpty()) {
        			if(hour> Integer.parseInt(list.get(0).substring(0,2))) {
        				table[i][j+1] = list.get(0);
        				list.remove(0);
        			} else if(hour==Integer.parseInt(list.get(0).substring(0,2)) && minute>= Integer.parseInt(list.get(0).substring(3)) ) {
        				table[i][j+1] = list.get(0);
        				list.remove(0);
        			}        			
        		}
        	}
        	minute += t;
        }
        if(table[n-1][m]==null) {
        	answer = table[n-1][0];
        } else {
        	if((Integer.parseInt(table[n-1][m].substring(0,2))-1)<10 && (Integer.parseInt(table[n-1][m].substring(3))-1)==-1){
        		answer = "0"+(Integer.parseInt(table[n-1][m].substring(0,2))-1) + ":59";
        	}else if((Integer.parseInt(table[n-1][m].substring(0,2))-1)>=10 && (Integer.parseInt(table[n-1][m].substring(3))-1)==-1) {
        		answer = (Integer.parseInt(table[n-1][m].substring(0,2))-1) + ":59";
        	}else if((Integer.parseInt(table[n-1][m].substring(3))-1)<10) {
        		answer = table[n-1][m].substring(0,3) +"0"+ (Integer.parseInt(table[n-1][m].substring(3))-1);
        	} else {
        		answer = table[n-1][m].substring(0,3) + (Integer.parseInt(table[n-1][m].substring(3))-1);        		
        	} 
        }
        return answer;
    }
}