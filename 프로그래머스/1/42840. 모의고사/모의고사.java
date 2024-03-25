import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
		int check1 = 0;
		int check2 = 0;
		int check3 = 0;
		int[] ch1 = {1,2,3,4,5};
		int[] ch2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] ch3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		for(int i=0;i<answers.length;i++) {
			if(answers[i]==ch1[i%5]) {
				check1++;
			}
			if(answers[i]==ch2[i%8]) {
				check2++;
			}
			if(answers[i]==ch3[i%10]) {
				check3++;
			}
		}
		int max = Math.max(check1,Math.max(check2, check3));
		if(max==check1) {
			temp.add(1);
		}
		if(max==check2) {
			temp.add(2);
		}
		if(max==check3) {
			temp.add(3);
		}
		int[] answer = new int[temp.size()];
		for(int i=0;i<temp.size();i++) {
			answer[i]=temp.get(i);
		}
        return answer;
    }
}