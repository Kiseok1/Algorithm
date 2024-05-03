import java.util.*;
class Solution {
	int answer;
    public int solution(String[][] clothes) {
        answer = 0;
        HashMap<String, Integer> item = new HashMap<>();
        for(String[] i : clothes) {
        	item.put(i[1], item.getOrDefault(i[1], 0)+1);
        }
        
        System.out.println(item);
        ArrayList<Integer> cnt = new ArrayList<>();
        for(String key : item.keySet()) {
    		cnt.add(item.get(key));    		
    	}
        System.out.println(cnt);
        if(item.size()==1) {
        	for(String key : item.keySet()) {
        		answer = item.get(key);        		
        	}
        } else {
        	for(int i=0;i<cnt.size();i++) {
        		dfs(i,cnt.get(i),cnt,cnt.size());
        	}
        }
        return answer;
    }
	public void dfs(int len, int cal,ArrayList<Integer> cnt, int size) {
		if(len>=size) return;
		
		answer += cal;
		for(int i=len+1;i<size;i++) {
			dfs(i,cal*cnt.get(i),cnt,size);
		}
		
	}
}