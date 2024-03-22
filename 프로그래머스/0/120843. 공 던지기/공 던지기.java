class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int check =0;
        for(int i=0;i<k;i++){
            System.out.println(numbers[check]);
            answer = numbers[check];
            check = check+2;
            if(check>numbers.length){
                check=1;
            } else if (check==numbers.length){
                check = 0;
            }
            
        }
        return answer;
    }
}