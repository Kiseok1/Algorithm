class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        if(length%2!=0){
            int i = (int)Math.ceil(length/2.0);
            answer = s.substring(i-1,i);
        } else {
            int i = (int)Math.ceil(length/2.0);
            answer = s.substring(i-1,i+1);
        }
        return answer;
    }
}