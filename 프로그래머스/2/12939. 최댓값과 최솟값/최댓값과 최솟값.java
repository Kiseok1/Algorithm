class Solution {
    public String solution(String s) {
        String answer = "";
		String[] arr = s.split(" ");
		
		long max = Long.parseLong(arr[0]);
		long min = Long.parseLong(arr[0]);
		for(String n : arr) {
			if(Long.parseLong(n)>max) max=Long.parseLong(n);
			if(Long.parseLong(n)<min) min=Long.parseLong(n);
		}
		answer = min + " "+ max;
        return answer;
    }
}