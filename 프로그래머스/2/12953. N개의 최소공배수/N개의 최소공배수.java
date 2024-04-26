import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int max = 0;
        int check = 0;
        while(answer==0) {
        	max+=arr[arr.length-1];
        	for(int i=0;i<arr.length;i++) {
        		if(max%arr[i]==0) check++;
        		else break;
        	}
        	if(check==arr.length) answer = max;
        	check=0;
        }
        return answer;
    }
}