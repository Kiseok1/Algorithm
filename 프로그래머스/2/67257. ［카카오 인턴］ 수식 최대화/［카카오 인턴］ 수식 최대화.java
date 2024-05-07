import java.util.*;
class Solution {
	long answer;
    public long solution(String expression) {
        answer = 0;
        String[] num = expression.split("[*+-]");
        String[] cal = expression.split("[0-9]+");
        
        ArrayList<Long> n = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();
        for(int i=0;i<num.length;i++) {
        	n.add(Long.parseLong(num[i]));
        	if(!cal[i].equals("")) {
        		c.add(cal[i]);
        	}
        }
        
        dfs(n,c,num,cal);
        
        return answer;
    }
	private void multiply(ArrayList<Long> n, ArrayList<String> c) {	
        for(int i=0;i<c.size();i++) {
        	if(c.get(i).equals("*")) {
        		n.set(i, n.get(i)*n.get(i+1));
        		n.remove(i+1);
        		c.remove(i);
        		i--;
        	}
        }
        
	}
	private void minus(ArrayList<Long> n, ArrayList<String> c) {
		for(int i=0;i<c.size();i++) {
        	if(c.get(i).equals("-")) {
        		n.set(i, n.get(i)-n.get(i+1));
        		n.remove(i+1);
        		c.remove(i);
        		i--;
        	}
        }
        
	}
	private void plus(ArrayList<Long> n, ArrayList<String> c) {
		for(int i=0;i<c.size();i++) {
        	if(c.get(i).equals("+")) {
        		n.set(i, n.get(i)+n.get(i+1));
        		n.remove(i+1);
        		c.remove(i);
        		i--;
        	}
        }
        
	}
	public void dfs(ArrayList<Long> n, ArrayList<String> c, String[] num, String[] cal) {
		plus(n, c);
		minus(n, c);
		multiply(n, c);
		answer = Math.max(answer, Math.abs(n.get(0)));
		n.clear();
		for(int i=0;i<num.length;i++) {
        	n.add(Long.parseLong(num[i]));
        	if(!cal[i].equals("")) {
        		c.add(cal[i]);
        	}
        }
		plus(n, c);
		multiply(n, c);
		minus(n, c);
		answer = Math.max(answer, Math.abs(n.get(0)));
		n.clear();
		for(int i=0;i<num.length;i++) {
			n.add(Long.parseLong(num[i]));
			if(!cal[i].equals("")) {
				c.add(cal[i]);
			}
		}
		minus(n, c);
		plus(n, c);
		multiply(n, c);
		answer = Math.max(answer, Math.abs(n.get(0)));
		n.clear();
		for(int i=0;i<num.length;i++) {
			n.add(Long.parseLong(num[i]));
			if(!cal[i].equals("")) {
				c.add(cal[i]);
			}
		}
		minus(n, c);
		multiply(n, c);
		plus(n, c);
		answer = Math.max(answer, Math.abs(n.get(0)));
		n.clear();
		for(int i=0;i<num.length;i++) {
			n.add(Long.parseLong(num[i]));
			if(!cal[i].equals("")) {
				c.add(cal[i]);
			}
		}
		multiply(n, c);
		plus(n, c);
		minus(n, c);
		answer = Math.max(answer, Math.abs(n.get(0)));
		n.clear();
		for(int i=0;i<num.length;i++) {
			n.add(Long.parseLong(num[i]));
			if(!cal[i].equals("")) {
				c.add(cal[i]);
			}
		}
		multiply(n, c);
		minus(n, c);
		plus(n, c);
		answer = Math.max(answer, Math.abs(n.get(0)));
		n.clear();
		for(int i=0;i<num.length;i++) {
			n.add(Long.parseLong(num[i]));
			if(!cal[i].equals("")) {
				c.add(cal[i]);
			}
		}
	}
}