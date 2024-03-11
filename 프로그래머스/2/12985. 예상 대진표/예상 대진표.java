class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        
        while(true){
            answer++;
            a = (int)Math.ceil(a/2.0);
            b = (int)Math.ceil(b/2.0);         
            if(a==b){ 
                break;
            }
        };
       

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);   

        return answer;
    }
}