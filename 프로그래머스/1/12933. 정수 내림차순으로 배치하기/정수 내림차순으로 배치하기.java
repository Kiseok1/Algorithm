import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
		String str = n+"";
		char[] l = str.toCharArray();
		String t = "";
		Arrays.sort(l);
		for(int i=0;i<l.length;i++) {
			t = l[i]+t;
		}
		System.out.println(t);
		answer = Long.parseLong(t);
        return answer;
    }
}