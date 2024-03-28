class Solution {
    public String solution(int a, int b) {
        String answer = "";
		int[] m = {31,29,31,30,31,30,31,31,30,31,30,31};
		int d = 0;
		for(int i=0;i<a-1;i++) {
			d = d + m[i];
		}
		d=d+b;
		d=d%7;
		System.out.println(d);
		switch(d) {
		case 0: answer = "THU"; break;
		case 1: answer = "FRI"; break;
		case 2: answer = "SAT"; break;
		case 3: answer = "SUN"; break;
		case 4: answer = "MON"; break;
 		case 5: answer = "TUE"; break;
		case 6: answer = "WED"; break;
		}
        return answer;
    }
}