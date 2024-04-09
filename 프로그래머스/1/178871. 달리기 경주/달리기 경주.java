import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
		ArrayList<String> rank = new ArrayList<>();
		HashMap<String, Integer> hm = new HashMap<>();
		StringBuilder temp = new StringBuilder();
		for(int i=0;i<players.length;i++) {
			rank.add(players[i]);
			hm.put(players[i], i);
		}
		
		for(int i=0;i<callings.length;i++) {
			temp.delete(0,temp.length());
			hm.put(rank.get(hm.get(callings[i])-1), hm.get(callings[i]));
			hm.put(callings[i], hm.get(callings[i])-1);
			temp.append(rank.get(hm.get(callings[i])));
			rank.set(hm.get(callings[i])+1, temp.toString());
			rank.set(hm.get(callings[i]), callings[i]);		
		}
		for(int i=0;i<rank.size();i++) {
			answer[i] = rank.get(i);
		}
        return answer;
    }
}