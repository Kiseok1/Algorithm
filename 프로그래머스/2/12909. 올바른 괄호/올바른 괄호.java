class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int n = s.length();
        if(n%2!=0) answer = false;
        int open = 0;
        int close = 0;
        char[] a = new char[n];
        
        for(int i=0;i<n;i++){
            a[i] = s.charAt(i);            
            if(a[i]=='('){
                open ++;
            } else {
                close ++;
            }
            if(open-close<0) {
                answer = false;
            }
        }
        
        if(open!=close) answer = false;
        if(a[n-1]!=')') answer = false;
        
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        

        return answer;
    }
}