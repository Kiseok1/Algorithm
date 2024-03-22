import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
		String[] temp = new String[n];
		for(int i=0;i<n;i++) {
			temp[i] = Integer.toString(arr1[i] | arr2[i], 2);
			while(temp[i].length()<n) {
				temp[i] = "0"+temp[i];
			}
			for(int j=0;j<n;j++) {
				if(j==0) {
					if(temp[i].charAt(j)=='0') {
						answer[i] =  " ";
					} else {
						answer[i] =  "#";
					}					
				}
				if(j!=0) {
					if(temp[i].charAt(j)=='0') {
						answer[i] = answer[i] + " ";
					} else {
						answer[i] = answer[i] + "#";
					}					
				}
			}
		}
		
		System.out.println(Arrays.toString(temp));
        return answer;
    }
}