class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
		int[] loc = {31,0,1,2,10,11,12,20,21,22,30,32};
		int locL = 10;
		int locR = 11;
		int gapL = 0;
		int gapR = 0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7 ) {
				locL = numbers[i];
				answer = answer + "L";
			} else if (numbers[i]==3 || numbers[i]==6 || numbers[i]==9) {
				locR = numbers[i];
				answer = answer + "R";
			} else {
				gapL= Math.abs(loc[numbers[i]]/10 - loc[locL]/10)+Math.abs(loc[numbers[i]]%10 - loc[locL]%10) ;
				gapR= Math.abs(loc[numbers[i]]/10 - loc[locR]/10)+Math.abs(loc[numbers[i]]%10 - loc[locR]%10) ;
				if(gapL>gapR) {
					locR = numbers[i];
					answer = answer + "R";
				} else if(gapL<gapR) {
					locL = numbers[i];
					answer = answer + "L";
				} else {
					if(hand.equals("right")) {
						locR = numbers[i];
						answer = answer + "R";
					} else {
						locL = numbers[i];
						answer = answer + "L";
					}
				} 
			}
		}
        return answer;
    }
}