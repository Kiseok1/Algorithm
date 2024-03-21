class Solution {
    public int solution(String dartResult) {
        int answer = 0;
		int[] point = new int[3];
		String[] bonus = new String[3];
		String[] option = new String[3];
		int checkNo = 0;
 		String check = "p";
		for(int i=0;i<dartResult.length();i++) {
			int j = i+1;
			int k = i+2;
			if(k>dartResult.length()) k=j;
			if(check.equals("p")) {
				point[checkNo]= dartResult.charAt(i)-'0';
				if(dartResult.substring(j, k).equals("0")) {
					point[checkNo] = 10;
					i++;
				}
				//System.out.println(i+","+check+","+checkNo+","+point[checkNo]);
				check = "b";
			} else if(check.equals("b")) {
				if(dartResult.substring(i,j).equals("D")) {
					point[checkNo] = point[checkNo]*point[checkNo];
				} else if (dartResult.substring(i,j).equals("T")) {
					point[checkNo] = point[checkNo]*point[checkNo]*point[checkNo];
				}
				//System.out.println("변경값1 : "+point[checkNo]);
				if(dartResult.substring(j, k).equals("*") || dartResult.substring(j, k).equals("#") ) {
					bonus[checkNo] = dartResult.charAt(i)+"";
					//System.out.println(i+","+check+","+checkNo+","+bonus[checkNo]);	
					check = "o";
				} else {
					bonus[checkNo] = dartResult.charAt(i)+"";
					//System.out.println(i+","+check+","+checkNo+","+bonus[checkNo]);
					check = "p";
					checkNo++;
				}
			} else {
				if( dartResult.substring(i, j).equals("*") ) {
					if(checkNo!=0) {
						point[checkNo-1]=point[checkNo-1]*2;
						point[checkNo]=point[checkNo]*2;
						//System.out.println("변경값2 : "+point[checkNo-1]);
						//System.out.println("변경값2 : "+point[checkNo]);
					} else {
						point[checkNo]=point[checkNo]*2;
						//System.out.println("변경값2 : "+point[checkNo]);
					}
				} else if( dartResult.substring(i, j).equals("#") ){
					if(checkNo!=0) {
						point[checkNo]=point[checkNo]*-1;
						//System.out.println("변경값2 : "+point[checkNo]);
					} else {
						point[checkNo]=point[checkNo]*-1;
						//System.out.println("변경값2 : "+point[checkNo]);
					}
				}
				option[checkNo] = dartResult.charAt(i)+"";
				//System.out.println(i+","+check+","+checkNo+","+option[checkNo]);
				check = "p";
				checkNo++;
			}
		}
		answer = point[0]+point[1]+point[2];
        
        return answer;
    }
}