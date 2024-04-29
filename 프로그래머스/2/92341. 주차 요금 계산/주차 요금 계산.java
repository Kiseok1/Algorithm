import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        
        String[][] matrix = new String[records.length][3];
        HashMap<String, Integer> map = new HashMap<>();
        TreeSet<String> set = new TreeSet<>();
        
        for(int i=0;i<records.length;i++) {
        	matrix[i]=records[i].split(" ");
        	matrix[i][0] =Integer.parseInt(matrix[i][0].substring(0, 2))*60+Integer.parseInt(matrix[i][0].substring(3))+"";
        	set.add(matrix[i][1]);
        	
        	if(matrix[i][2].equals("IN")) {
        		map.put(matrix[i][1], map.getOrDefault(matrix[i][1], 0)-Integer.parseInt(matrix[i][0]));        		
        	} else {
        		map.put(matrix[i][1], map.getOrDefault(matrix[i][1], 0)+Integer.parseInt(matrix[i][0])); 
        	}
        }
        Iterator<String> iter = set.iterator();
        int[] answer = new int[set.size()];

        for(String s : set) {
        	if(map.get(s)<=0) {
        		map.put(s, map.get(s)+1439);
        	}
        }
        
        int i=-1;
    	while(iter.hasNext()) {
    		i++;
    		answer[i] = (int) (fees[1]+ (Math.max(0, (int)Math.ceil((map.get(iter.next())-fees[0])/(double)fees[2]))) * fees[3]);
    	}
        
        
        return answer;
    }
}