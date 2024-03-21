import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int n) {
        int answer = 0;
		ArrayList<Integer> answer3 = new ArrayList<Integer>();
		ArrayList<Integer> answer3check = new ArrayList<Integer>();
		int tri = 1;
		int i = 0;
		
		while(n>0) {
			tri = tri*3;
			i++;
			if(tri>n) {
				n= n-(tri/3);
				answer3.add(tri/3);
				tri=1;
				answer3check.add(i-1);
				i=0;
			} 			
		}
		int check = answer3check.get(0);
		int[] a10 = new int[answer3check.get(0)+1];
		a10[answer3check.get(0)] = 1;
		for(int j=1;j<answer3check.size();j++) {
			if(check==answer3check.get(j)) {
				a10[answer3check.get(j)] = a10[answer3check.get(j)]+1;
				//System.out.println("if c: "+check);
				//System.out.println("if a: "+answer3check.get(j));
			} else {
				a10[answer3check.get(j)] = 1;
				//System.out.println("else c: "+check);
				//System.out.println("else a: "+answer3check.get(j));
				check=answer3check.get(j);
			}
		}
		int a10n = 1;
		for(int j=0;j<a10.length-1;j++) {
			for(int k=0;k<a10.length-1-j;k++) {
				a10n = a10n *3;
			}
			a10n = a10n * a10[j];
			//System.out.println(a10n);
			answer = answer + a10n;
			a10n = 1;
		}
		
		answer = answer + a10[answer3check.get(0)];
		//System.out.println(answer3.toString());
		//System.out.println(answer3check.toString());
		//System.out.println(Arrays.toString(a10));
        return answer;
    }
}