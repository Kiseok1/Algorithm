import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.regex.Pattern;
import java.util.Collections;

class Solution {
    public int solution(int n) {
        int answer = 1;
		for(int i=0;i<n;i++) {
			if((answer>=30 && answer<40)) {
				System.out.println("ans0 : "+answer);
				answer++;
				i--;
				continue;
			}
			if(answer%3==0 ) {
				System.out.println("ans1 : "+answer);
				answer++;
				if(Integer.toString(answer).contains("3")) {
					System.out.println("ans1 : "+answer);
					answer++;
				}
				if((answer>=130 && answer<140)) {
					i--;
					continue;
				}
			}
			if(Integer.toString(answer).contains("3")) {
				System.out.println("ans2 : "+answer);
				answer++;
				if(answer%3==0 ) {
					System.out.println("ans2 : "+answer);
					answer++;
				}
				if((answer>=130 && answer<140)) {
					i--;
					continue;
				}
			}
			System.out.println(i+","+answer);
			answer++;
		}
		answer--;
        return answer;
    }
}