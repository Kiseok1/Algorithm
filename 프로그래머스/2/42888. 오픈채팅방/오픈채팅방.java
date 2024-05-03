import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        
        String[][] arr = new String[record.length][3];
        HashMap<String, String> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<record.length;i++) {
        	arr[i] = record[i].split(" ");
        }
        for(int i=0;i<record.length;i++) {
        	switch(arr[i][0]) {
        	case "Enter":
        		list.add(arr[i][1]+"님이 들어왔습니다.");
        		map.put(arr[i][1], arr[i][2]);
        		break;
        	case "Leave":	
        		list.add(arr[i][1]+"님이 나갔습니다.");
        		break;
        	case "Change":
        		map.put(arr[i][1], arr[i][2]);
        	}
        }
        String[] answer = new String[list.size()];
        for(int i=0;i<list.size();i++) {
        	answer[i] = list.get(i).replaceAll(list.get(i).substring(0,list.get(i).indexOf("님")), map.get(list.get(i).substring(0,list.get(i).indexOf("님"))));
        }
        return answer;
    }
}