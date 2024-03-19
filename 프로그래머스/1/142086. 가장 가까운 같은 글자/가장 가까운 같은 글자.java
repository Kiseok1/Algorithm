class Solution {
    public int[] solution(String s) {
        int length= s.length();
        int[] answer = new int[length];
        answer[0] = -1;
        for(int i=length-1;i>=0;i--) {
        	for(int j=i-1;j>=0;j--) {
        		if(s.charAt(i)==s.charAt(j)) {
        			System.out.println(i+","+j+" "+ (i-j) +" "+s.charAt(j));
        			answer[i]=(i-j);
        			break;
        		} else {
        			answer[i]=-1;
        		}
        	}
        }
        
        return answer;
    }
}