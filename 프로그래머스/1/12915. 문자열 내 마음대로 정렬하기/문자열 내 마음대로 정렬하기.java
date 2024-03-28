import java.util.PriorityQueue;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
		String[] temp = new String[strings.length];
		PriorityQueue<String> ch = new PriorityQueue<String>();
		for(int i=0;i<strings.length;i++) {
			temp[i] = strings[i].charAt(n)+strings[i];
			ch.add(temp[i]);
		}
		for(int i=0;i<strings.length;i++) {
			answer[i] = ch.poll().substring(1);
		}
        
        return answer;
    }
}