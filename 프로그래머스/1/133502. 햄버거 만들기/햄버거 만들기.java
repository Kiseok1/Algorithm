import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
		StringBuilder raw = new StringBuilder();
		
		for(int i=0;i<ingredient.length;i++) {
			raw.append(ingredient[i]);
			if(raw.length()>3 && raw.substring(raw.length()-4, raw.length()).equals("1231")) {
				raw.delete(raw.length()-4, raw.length());
				answer++;
			}
		}
		
        return answer;
    }
}