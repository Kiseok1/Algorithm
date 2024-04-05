class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
		String temp = "";
		String[] ex = {"aya", "ye", "woo", "ma"};
		String[] ex2 = {"ayaaya", "yeye", "woowoo", "mama"};
		
		for(int i=0;i<babbling.length;i++) {
			for(int j=0;j<4;j++) {
				babbling[i] = babbling[i].replaceAll(ex2[j], "x");
			}			
			for(int j=0;j<4;j++) {
				babbling[i] = babbling[i].replaceAll(ex[j], " ");
			}			
			babbling[i] = babbling[i].replaceAll(" ", "");
			System.out.println(babbling[i]);
			if(babbling[i].equals("")) answer++;
		}
        return answer;
    }
}