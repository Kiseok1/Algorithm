import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int [id_list.length];
		int[][] ban = new int[id_list.length+1][id_list.length];
		HashMap<String, Integer> id = new HashMap<String, Integer>();
		for(int i=0;i<id_list.length;i++) {
			id.put(id_list[i], i);
		}
		for(int i=0;i<report.length;i++) {
			String[] sep = report[i].split(" ");
			if(ban[id.get(sep[0])][id.get(sep[1])]==0) {
				ban[id.get(sep[0])][id.get(sep[1])] ++;				
			}
		}
		for(int i=0;i<ban.length-1;i++) {
			for(int j=0;j<ban.length-1;j++) {
				ban[id_list.length][i] = ban[id_list.length][i]+ban[j][i];
			}
		}
		for(int i=0;i<ban[id_list.length].length;i++) {
			if(ban[id_list.length][i]>=k) {
				for(int j=0;j<id_list.length;j++) {
					if(ban[j][i]==1) answer[j]++;
				}
			}
		}
		
        return answer;
	
    }
}