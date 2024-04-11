import java.util.*;
class Solution {
    public int solution(String word) {
        int answer = 0;
		String[] aeiou = {"A","E","I","O","U"};
		int[] r = {0,0,0,0,0};
		ArrayList<String> arr = new ArrayList<>();
		int c = 0;
		int d = 0;
		StringBuilder temp = new StringBuilder();
		while(!word.equals(temp.toString())) {
		
			answer++;
			
			switch(c) {
			case 0:
				if(r[c]==5) r[c]=0;
				if(temp.toString().length()>0) {
					temp.setLength(0);
					
				}
				if(d!=4) {
					temp.append(aeiou[r[c]]);
					arr.add(temp.toString());
					
					r[c]++;
					c++;			
				} else if(d==4) {
					temp.append(aeiou[d]);
					arr.add(temp.toString());
					
					d=0;
					r[c]++;
					
				}
				break;
			case 1:
				if(r[c]==5) r[c]=0;
				if(temp.toString().length()>1) {
					temp.setLength(1);
					
				}
				if(d!=4) {
					temp.append(aeiou[r[c]]);
					arr.add(temp.toString());
					
					r[c]++;
					c++;			
				} else if(d==4) {
					temp.append(aeiou[d]);
					arr.add(temp.toString());
					
					d=0;
					r[c]++;
					
				}
				break;
			case 2:
				if(r[c]==5) r[c]=0;
				if(temp.toString().length()>2) {
					temp.setLength(2);
					
				}
				if(d!=4) {
					temp.append(aeiou[r[c]]);
					arr.add(temp.toString());
					
					r[c]++;
					c++;			
				} else if(d==4) {
					temp.append(aeiou[d]);
					arr.add(temp.toString());
					
					d=0;
					r[c]++;
					
				}
				break;
			case 3:
				if(r[c]==5) r[c]=0;
				if(temp.toString().length()>3) {
					temp.setLength(3);
					
				}
				if(d!=4) {
					temp.append(aeiou[r[c]]);
					arr.add(temp.toString());
					
					r[c]++;
					c++;			
				} else if(d==4) {
					temp.append(aeiou[d]);
					arr.add(temp.toString());
					
					d=0;
					r[c]++;
					
				}
				break;
			case 4:
				if(r[c]==5) r[c]=0;
				if(temp.toString().length()>4) {
					temp.setLength(4);;
				}
				if(d!=4) {
					temp.append(aeiou[d]);
					arr.add(temp.toString());
					
					d++;
					r[c]++;
				} else if(d==4) {
					temp.append(aeiou[d]);
					arr.add(temp.toString());
					
					d=0;
					r[c]++;
					
					for(int i=4;i>=0;i--) {
						if(r[i]!=5) {
							c=i;
							break;
						}
					}
					
				}
				break;	
			}//switch			
		}//while
        return answer;
    }
}