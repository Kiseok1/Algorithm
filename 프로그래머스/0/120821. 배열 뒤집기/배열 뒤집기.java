class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length-1;
        int[] answer = new int[length+1];        
        for(int i=0;i<=length;i++){
            System.out.print(i);
            System.out.println(length-i);
            int j=length-i;
            answer[i]=num_list[j];
        }
        //System.out.print(answer);
        
        return answer;
    }
}