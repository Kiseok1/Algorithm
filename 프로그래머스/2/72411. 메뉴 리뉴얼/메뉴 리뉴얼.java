import java.util.*;

class Solution {
	TreeMap<String, Integer> map = new TreeMap<>();
    public String[] solution(String[] orders, int[] course) {
        
        // 주문 오름차순 정렬
        PriorityQueue<Character> pq = new PriorityQueue<>();
        for(int i=0;i<orders.length;i++) {
        	StringBuilder sb = new StringBuilder();
        	for(int j=0;j<orders[i].length();j++) {
        		pq.add(orders[i].charAt(j));
        	}
        	while(!pq.isEmpty()) {
        		sb.append(pq.poll());
        	}
        	orders[i] = sb.toString();
        }
        
        for(int i=0;i<course.length;i++) {
        	for(int j=0;j<orders.length;j++) {
        		dfs("",0,0,orders[j],course[i]);
        		
        	}
        }
        
        HashMap<Integer, Integer> ans = new HashMap<>();
        for(String key : map.keySet()) {
        	if(map.get(key)>=2) {
        		ans.put(key.length(), Math.max(ans.getOrDefault(key.length(), 0) , map.get(key)));
        	}
        }
       
        ArrayList<String> temp = new ArrayList<>();
        for(String key : map.keySet()) {
        	if(map.get(key)==ans.get(key.length())) {
        		temp.add(key);
        	}
        }
        
        String[] answer = new String[temp.size()];
        for(int i=0;i<temp.size();i++) {
        	answer[i] = temp.get(i);
        }
        return answer;
    }
    
	public void dfs(String str, int len, int start ,String menu, int max) {
		if(len>max || menu.length()<max ) return;
		if(str.length()==max) {
			
			map.put(str, map.getOrDefault(str, 0)+1);
		}
		for(int i=start;i<menu.length();i++) {
			if(!str.contains(menu.charAt(i)+"")) {
				start++;
				dfs(str+menu.charAt(i),len+1, start, menu,max);										
			}
		}
	}
	
    
    
}