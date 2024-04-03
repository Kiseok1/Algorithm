import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] xCount = new int[10];
        int[] yCount = new int[10];
        for(int i=0;i<X.length();i++) {
        	xCount[(int)X.charAt(i)-48]++;
        }
        for(int i=0;i<Y.length();i++) {
        	yCount[(int)Y.charAt(i)-48]++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=9;i>=0;i--) {
        	if(xCount[i]!=0 && yCount[i]!=0) {
        		for(int j=0;j<Math.min(xCount[i], yCount[i]);j++) {
        			sb.append(i);
        		}
        	}
        }
        
        answer = sb.toString();
        if(answer.equals("")) answer ="-1";
        if(answer.replaceAll("0", "").equals("")) answer = "0";
        return answer;
    }
}