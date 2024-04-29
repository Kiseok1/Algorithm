class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        int k = 0 ;
        int check = 0;
        StringBuilder sb = new StringBuilder();
        while(true) {
        	for(int i=0;i<Integer.toString(k, n).length();i++) {
        		
        		if(check%m==p-1 && i!=Integer.toString(k, n).length()) {
        			sb.append(Integer.toString(k, n).toUpperCase().substring(i, i+1));
        			if(sb.length()==t) {
                		break;
                	}
        		} else if(check%m==p-1 && i==Integer.toString(k, n).length()) {
        			sb.append(Integer.toString(k, n).toUpperCase().substring(i));
        			if(sb.length()==t) {
                		break;
                	}
        		}
        		check++;
        	}
        	
        	k++;
        	
        	if(sb.length()==t) {
        		break;
        	}
        }
        answer = sb.toString();
        return answer;
    }
}