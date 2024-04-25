import java.util.*;
class Solution {
	public int[] solution(String s) {
        
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Queue<Integer>> result = new ArrayList<>();
        ArrayList<Integer> open = new ArrayList<>();
        ArrayList<Integer> close = new ArrayList<>();
        for(int i=1;i<s.length()-1;i++) {
        	if(s.charAt(i)=='{') {
        		open.add(i+1);
        	} else if(s.charAt(i)=='}') {
        		close.add(i);
        	}
        }
        for(int i=0;i<open.size();i++) {
        	list.add(close.get(i)-open.get(i));
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<list.size();i++) {
        	map.put(list.get(i), i);
        }
        
        
        List<Integer> keySet = new ArrayList<>(map.keySet());

        Collections.sort(keySet);
        
        for (int key : keySet) {
            
            
            String[] temp = s.substring(open.get(map.get(key)),close.get(map.get(key))).split(",");
            Stack<Integer> stack = new Stack<>();
            Queue<Integer> que = new LinkedList<>();
            for(int i=0;i<temp.length;i++) {
            	que.add(Integer.parseInt(temp[i]));
            }
            result.add(que);
        }
        
        int[] answer = new int[result.get(result.size()-1).size()];
        Arrays.fill(answer, -1);
        HashSet<Integer> hs = new HashSet<>();
        answer[0] = result.get(0).peek();
        hs.add(result.get(0).poll());
        for(int i=1;i<result.size();i++) {
        	while(result.get(i).size()!=0) {
        		if(!hs.contains(result.get(i).peek())) {
        			answer[i] = result.get(i).peek();
        			hs.add(result.get(i).poll());
        			result.get(i).clear();
        		} else {
        			result.get(i).add(result.get(i).poll());
        		}
        	}
        }
        
        return answer;
    }
}