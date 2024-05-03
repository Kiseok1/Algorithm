import java.util.*;
class Solution {
    public String solution(String p) {
        String answer = "";
        answer = dfs(p);
        return answer;
    }

	public String dfs(String w) {
		if(w.isEmpty()) return "";
		String u = "";
		String v = "";
		String result = "";
		int open = 0;
		for(int i=0;i<w.length();i++) {
			char c = w.charAt(i);
			if(c=='(') {
				open++;
			} else {
				open--;
			}
			if(open==0) {
				u = w.substring(0,i+1);
				v = w.substring(i+1);
				break;
			}
		}
		
		if(check(u)) {
			return u+dfs(v);
		} else {
			result = "("+dfs(v)+")";
			for(int i=1;i<u.length()-1;i++) {
				if(u.charAt(i)=='(') {
					result += ')';
				} else {
					result += '(';
				}
			}
		}
		
		return result;
	}

	public boolean check(String u) {
		Stack<Character> s = new Stack<>();
        for (int i = 0; i < u.length(); i++) {
            char c = u.charAt(i);
            if (c == '(') {
                s.push(c);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                s.pop();
            }
        }
        return true;
	}
}