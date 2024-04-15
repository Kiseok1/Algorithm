class Solution {
    int[] answer = new int[2];
    public int[] solution(int[][] arr) {       
		int len = arr.length;
		sol(arr,0,0,len);
        return answer;
	}

	public void sol(int[][] arr, int sy, int sx, int len) {
		int loc = arr[sy][sx];
		if(len==1) {
			if(loc==0) {
				answer[0] ++;				
			} else {
				answer[1] ++;
			}		
			return;
		}
		
		int check = 0;
		for(int y=sy;y<sy+len;y++) {
			for(int x=sx;x<sx+len;x++) {
				if(arr[y][x]!=loc) {
					//System.out.println(loc);
					check = 1;
					break;
				}
			}
			if(check==1) break;
		}
		
		if(check==1) {
			for (int i = sy; i < sy+len; i+=len/2) { 
				for (int j = sx; j < sx+len; j+=len/2) { 
					sol(arr,i,j,len/2);				
				}
			}
		} else {
			if(loc==0) {
				answer[0] ++;				
			} else {
				answer[1] ++;
			}		
		}
		
	}
	
	
}