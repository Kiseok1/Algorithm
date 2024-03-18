import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int length = arr.length;        
        int check=1;
        for(int i=0;i<arr.length-1;i++){
            
            if(arr[i]!=arr[i+1]){
                
                check++;
            }
        }
        int[] answer = new int[check];
        int check1=1;
        for(int i=0;i<arr.length-1;i++){
            if(i==0){
                answer[i]=arr[i];
            }
            if(arr[i]!=arr[i+1]){
                answer[check1]=arr[i+1];
                check1++;
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        

        return answer;
    }
}