import java.util.ArrayList;

class Solution {
    public String solution(String new_id) {
        String answer = "";
		new_id=new_id.toLowerCase();
		new_id=new_id.replaceAll("[^a-z0-9-_.]","");
		ArrayList<Character> id = new ArrayList<Character>();
		id.add(new_id.charAt(0));
		for(int i=1;i<new_id.length();i++) {
			if(new_id.charAt(i)=='.' && new_id.charAt(i)==new_id.charAt(i-1)) {
				continue;
			}
			id.add(new_id.charAt(i));
		}
		if(id.get(0)=='.') id.remove(0);
		
		if(id.isEmpty()) id.add('a');
		if(id.get(id.size()-1)=='.') id.remove(id.size()-1);
		
		while(id.size()>=16) {
			id.remove(id.size()-1);
		}
		
		if(id.get(id.size()-1)=='.') id.remove(id.size()-1);
		while(id.size()<3) {
			id.add(id.get(id.size()-1));
		}
		
		for(int i=0;i<id.size();i++) {
			answer = answer + id.get(i);
		}
		System.out.println("test : "+new_id);
		System.out.println("test : "+id.toString());
        return answer;
    }
}