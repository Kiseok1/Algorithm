class Solution {
    public int[] solution(String[] wallpaper) {
        
        int length = wallpaper.length;
        int[] answer = {length,51,0,0};
        for(int i=0;i<length;i++){
            int an1 = wallpaper[i].indexOf("#");
            int an2 = wallpaper[i].lastIndexOf("#");
            System.out.print(i+""+an1+",");
            System.out.println(i+""+(an2));
            if(an1!=-1){
                if(answer[0]>=i){
                    answer[0]=i;
                }
                if(answer[1]>an1){
                answer[1]=an1;
                }
            }
            if(an2!=-1){
                if(answer[2]<=i){
                    answer[2]=i+1;
                }
                if(answer[3]<=an2){
                answer[3]=an2+1;
                }
            } 
        }
        
        return answer;
    }
}