import java.util.*;
class Solution {
	Set<Integer> set;
    public int solution(String numbers) {
        set = new HashSet<>();
    	int answer = 0;
        char[] card = numbers.toCharArray();
        for(int i=0;i<card.length;i++) {
        	boolean[] visited = new boolean[card.length];
        	dfs(0,i,card,visited,card[i]+"");        	
        }
        for(int i : set) {
        	for(int j=2;j<=i;j++) {
        		if(j!=i && i%j==0) {
        			break;
        		}
        		if(j==i) {
        			answer++;        			
        		}
        	}
        }
        return answer;
    }

	public void dfs(int depth, int idx, char[] card, boolean[] visited, String n) {
		if(n.length()==card.length+1) {	
			return;
		}
		set.add(Integer.parseInt(n));
		visited[idx]=true;
		for(int i=0;i<card.length;i++) {
			if(visited[i]) continue;
			dfs(depth+1,i,card,visited,n+card[i]);
			visited[i] = false;
		}
		
	}
}