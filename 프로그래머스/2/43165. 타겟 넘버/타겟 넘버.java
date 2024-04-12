class Solution {
    int answer = 0;
	public int solution(int[] numbers, int target) {
		dfs(numbers,numbers[0],0,target);
		dfs(numbers,-1*numbers[0],0,target);
        
        return answer;
    }

	public void dfs(int[] numbers, int i, int j, int target) {
		if(j==numbers.length-1) {
			if(i==target) {
				answer++;
			}
			return;
		}
		dfs(numbers,i+numbers[j+1],j+1,target);
		dfs(numbers,i-numbers[j+1],j+1,target);
	}
}