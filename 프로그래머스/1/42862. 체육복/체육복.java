import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
		int[] stu = new int[n+1];
        Arrays.sort(lost);
		Arrays.sort(reserve);
		ArrayList<Integer> r = new ArrayList<Integer>();
		for(int i=0;i<lost.length;i++) {
			stu[lost[i]] = -1;
		}
		for(int i=0;i<reserve.length;i++) {
			r.add(reserve[i]);
		}
		for(int i=0;i<r.size();i++) {
			if(stu[r.get(i)]==-1) {
				stu[r.get(i)] = 0;
				r.remove(i);
                i--;
				answer++;
			}
		}
		System.out.println(Arrays.toString(stu));
		for(int i=0;i<stu.length;i++) {
			if(stu[i]==-1) {
				for(int j=0;j<r.size();j++) {
					if(i-1==r.get(j) || i+1==r.get(j)) {
						stu[i] = 0;
						r.remove(j);
						answer++;
					}
				}
			}
		}
        return answer;
    }
}