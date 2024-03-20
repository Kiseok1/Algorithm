import java.util.ArrayList;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
		ArrayList<Integer> temp = new ArrayList<Integer>();
		if(total%num==0) {
			for(int i=total/num-(num/2);i<=total/num+(num/2);i++) {
				temp.add(i);
				System.out.println(i);
			}
		} else {
			for(int i=total/num-(num/2)+1;i<=total/num+(num/2);i++) {
				temp.add(i);
				System.out.println(i);
			}
		}
		for(int i=0;i<temp.size();i++) {
			answer[i]=temp.get(i);
		}
		
        return answer;
    }
}