import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;
        char[] c = skill.toCharArray();
        
        int[] check = new int[c.length];
        Arrays.fill(check, -1);
    	for(int i=0;i<skill_trees.length;i++) {
    		for(int j=0;j<skill_trees[i].length();j++) {
				for(int k=0;k<c.length;k++) {
        			if(skill_trees[i].charAt(j)==c[k]) {
        				check[k]=j;
        			}
        		}
        	}
    		
    		for(int j=0;j<check.length-1;j++) {
    			
    			if((check[j]-check[j+1]>0 && check[j+1]!=-1 ) || (check[j]==-1 && check[j+1]!=-1) ) {
    				answer--;
    				System.out.println("answer--");
    				System.out.println(answer);
    				break;
    			}
    			
    		}
    		Arrays.fill(check, -1);
        }
        return answer;
    }
}