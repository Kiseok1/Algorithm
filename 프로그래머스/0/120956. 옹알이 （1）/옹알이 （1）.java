class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for(String check : babbling) {
        	System.out.println("전 : "+check);
            check = check.replace("aya", "1");
        	check = check.replace("ye", "1");
        	check = check.replace("woo", "1");
        	check = check.replace("ma", "1");
        	if(check.contains("1")) {
        		check = check.replace("1", "");
                if(check.equals("")){
                    answer++;  
                }                      
        	}
            System.out.println("후 : "+check);
        }     
        
        return answer;
    }
}