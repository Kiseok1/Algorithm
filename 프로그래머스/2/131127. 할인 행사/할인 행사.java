import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int check = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<want.length;i++) {
        	map.put(want[i], number[i]);
        }
        
        for(int i=0;i<discount.length-9;i++) {
        	for(int j=i;j<i+10;j++) {
        		if(!map.containsKey(discount[j]) || map.get(discount[j])==0) {
        			break;
        		} else {
        			map.put(discount[j], map.get(discount[j])-1);
        		}
        	}
        	for(int j=0;j<want.length;j++) {
        		check += map.get(want[j]);
        		map.put(want[j], number[j]);
        	}
        	if(check==0) {
        		answer++;
        	}
        	check=0;
        }
        return answer;
    }
}