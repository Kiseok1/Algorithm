class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int[] temp = new int[4];
        for(int i=0;i<words.length-1;i++) {
        	if(words[i].charAt( words[i].length()-1 )!=words[i+1].charAt(0)) {
        		temp[0] = ((i+1)%n)+1;
        		temp[1] = ((i+1)/n)+1;
        		break;
        	}
        }
        
        
    	for(int i=0;i<words.length-1;i++) {
    		for(int j=i+1;j<words.length;j++) {
    			if(words[i].equals(words[j])) {
    				temp[2] = j%n+1;
    				temp[3] = j/n+1; 
    			}
    		}
    	}      	
    	
    	if(temp[1]!=0 && temp[3]!=0) {
    		if(temp[1]<temp[3]) {
    			answer[0] = temp[0];
    			answer[1] = temp[1];			
    		} else {
    			answer[0] = temp[2];
    			answer[1] = temp[3];
    		}
    	} else {
    		if(temp[1]>temp[3]) {
    			answer[0] = temp[0];
    			answer[1] = temp[1];			
    		} else {
    			answer[0] = temp[2];
    			answer[1] = temp[3];
    		}
    	}
        return answer;
    }
}