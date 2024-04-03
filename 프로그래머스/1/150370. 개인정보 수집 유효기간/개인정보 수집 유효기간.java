import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
		int year = 0;
		int month = 0;
		int day = 0;
		char t;
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>(); 
		for(int i=0;i<terms.length;i++) {
			map.put(terms[i].charAt(0), Integer.parseInt(terms[i].substring(2)));
		}
		for(int i=0;i<privacies.length;i++) {
			t = privacies[i].charAt(11);
			year = Integer.parseInt(privacies[i].substring(0, 4));
			
			month = (Integer.parseInt(privacies[i].substring(5, 7)) + map.get(t));
			while(month>12) {
				year = year+1;
				month = month-12;
			}
			day = Integer.parseInt(privacies[i].substring(8, 10)) -1;
			if(day==0) {
				month = month -1;
				day = 28;
			}
			
			if(Integer.parseInt(today.substring(0,4))>year) {
				temp.add(i);
			} else if(Integer.parseInt(today.substring(0,4))<year) {
				continue;
			} else {
				if(Integer.parseInt(today.substring(5,7))>month) {
					temp.add(i);
				} else if (Integer.parseInt(today.substring(5,7))<month) {
					continue;
				} else {
					if(Integer.parseInt(today.substring(8,10))>day) {
						temp.add(i);
					} else {
						continue;
					}
				}
			}
		}
		
		int[] answer = new int[temp.size()];
		for(int i=0;i<temp.size();i++) {
			answer[i] = temp.get(i)+1;
		}
        return answer;
    }
}