class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
		int rt = 0;
		int cf = 0;
		int jm = 0;
		int an = 0;
		for(int i=0;i<survey.length;i++) {
			switch(survey[i]) {
			case "AN": 				
				an += (4-choices[i]);
				break;
			case "NA": 				
				an -= (4-choices[i]);
				break;
			case "RT": 				
				rt += (4-choices[i]);
				break;
			case "TR": 				
				rt -= (4-choices[i]);
				break;
			case "JM": 				
				jm += (4-choices[i]);
				break;
			case "MJ": 				
				jm -= (4-choices[i]);
				break;
			case "CF": 				
				cf += (4-choices[i]);
				break;
			case "FC": 				
				cf -= (4-choices[i]);
				break;
			}
		}
		
		if(rt>=0) {
			answer += "R";
		} else {
			answer += "T";
		}
		if(cf>=0) {
			answer += "C";
		} else {
			answer += "F";
		}
		if(jm>=0) {
			answer += "J";
		} else {
			answer += "M";
		}
		if(an>=0) {
			answer += "A";
		} else {
			answer += "N";
		}
		
		
        return answer;
    }
}