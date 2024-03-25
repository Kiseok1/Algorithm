

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
		int check1 = 0;
		int check2 = 0;
		for(int i=0;i<goal.length;i++) {
			for(int j=0;j<cards1.length;j++) {
				if(goal[i].equals(cards1[j])) {
					check1 = j;
					continue;
				}			
			}
			for(int j=0;j<cards2.length;j++) {
				if(goal[i].equals(cards2[j])) {
					check2 = j;
					continue;
				}
			}
		}
		//System.out.println(check1);
		//System.out.println(check2);
		if(check1+check2==goal.length-2) {
			answer = "Yes"; 
		} else {
			answer = "No";
		}
        
        return answer;
    }
}