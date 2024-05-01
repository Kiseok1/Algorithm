import java.util.*;
class Solution {
    public double[] solution(int k, int[][] ranges) {
        
        ArrayList<int[]> xy = new ArrayList<>();
        ArrayList<double[]> cal = new ArrayList<>();
        int x = 0;
        while(k!=1) {
        	xy.add(new int[] {x,k});
        	if(k%2==0) {
        		k = k/2;
        	} else {
        		k = (k*3)+1;
        	}
        	if(x!=0) {
        		cal.add(new double[] {x, (Math.min(xy.get(x)[1], xy.get(x-1)[1])) + ( Math.abs(xy.get(x)[1]-xy.get(x-1)[1] ) )/2.0  });
        	}
        	x++;
        }
        xy.add(new int[] {x,k});
        cal.add(new double[] {x, (Math.min(xy.get(x)[1], xy.get(x-1)[1])) + ( Math.abs(xy.get(x)[1]-xy.get(x-1)[1] ) )/2.0  });
       
        ArrayList<Double> temp = new ArrayList<>();
        for(int[] r : ranges) {
        	int s = r[0];
        	int e = xy.size() + r[1]-1;
        	double c = 0;
        	for(int i=s;i<e;i++) {
        		c += cal.get(i)[1];
        	}	
        	if(s-e>0) c=-1;
        	temp.add(c);
        }
        
        double[] answer = new double[temp.size()];
        for(int i=0;i<temp.size();i++) {
        	answer[i] = temp.get(i);
        }
        return answer;
    }
}