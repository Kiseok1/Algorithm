import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
		int length = nums.length;
		ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i=0;i<length;i++) {
        	for(int j=i+1;j<length;j++) {
        		for(int k=j+1;k<length;k++) {
        			//System.out.println(nums[i]+" "+nums[j]+" "+nums[k]+" = "+(nums[i]+nums[j]+nums[k]));
        			temp.add(nums[i]+nums[j]+nums[k]);
        		}
        	}
        }
        
        for(int i=0;i<temp.size();i++) {
        	ArrayList<Integer> check = new ArrayList<Integer>();
        	for(int j=1;j<=temp.get(i);j++) {
        		if(temp.get(i)%j==0) {
        			check.add(j);
        		}
        	}
        	if(check.size()==2) {
        		answer++;
        	}
        }

        return answer;
    }
}