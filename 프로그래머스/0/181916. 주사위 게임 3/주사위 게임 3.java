import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        int[] dice = {a,b,c,d};
        int[] count = new int[7];
        Arrays.sort(dice);
        for(int i=0;i<dice.length;i++) {
        	count[dice[i]]++;
        }
        HashSet<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        int check = set.size();
        
        
        if(check==1) {
        	answer = 1111* a;
        } else if(check==4) {
        	answer = dice[0];
        } else if(check==3) {
        	answer = 1;
        	for(int i=0;i<count.length;i++) {
        		if(count[i]==1) {
        			answer = answer*i;
        		}
        	}       	
        } else if(check==2) {
        	int p=0, q=0;
        	for(int i=0;i<count.length;i++) {
        		if(count[i]==1) q=i;
        		if(count[i]==3) p=i;
        		answer = (int)Math.pow((10*p+q),2);
        	}
        	if (answer==0) {
        		answer = (dice[0]+dice[3]) * Math.abs(dice[0]-dice[3]);
        	}
        }
        
        
        return answer;
    }
}